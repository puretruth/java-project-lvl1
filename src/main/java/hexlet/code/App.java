package hexlet.code;

import hexlet.code.gameEngine.Engine;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Greet;
import hexlet.code.games.Calc;
import hexlet.code.utils.Cli;

public class App {

    private static final String GAME_SELECTION_PATTERN = """
            Please enter the game number and press Enter.
            1 - Greet
            2 - Even
            3 - Calc
            4 - GCD
            0 - Exit
            Your choice:\s""";

    public static void main(String[] args) {

        switch (Cli.getUserIntAnswer(GAME_SELECTION_PATTERN)) {
            case 1 -> {// greet
                var game = new Greet();
                game.showGreeting();
            }
            case 2 -> {// even
                var game = new Even();
                var gameEng = new Engine(game);
                gameEng.startGame();
            }
            case 3 -> {// calc
                var game = new Calc();
                var gameEng = new Engine(game);
                gameEng.startGame();
            }
            case 4 -> {// GCD
                var game = new GCD();
                var gameEng = new Engine(game);
                gameEng.startGame();
            }
            default -> System.out.println("Goodbye!");// exit
        }
    }
}
