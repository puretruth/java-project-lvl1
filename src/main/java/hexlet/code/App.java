package hexlet.code;

import hexlet.code.gameEngine.Engine;
import hexlet.code.utils.Cli;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Greet;
import hexlet.code.games.Calc;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {

    private static final int GAME_NUMBER_GREET = 1;
    private static final int GAME_NUMBER_EVEN = 2;
    private static final int GAME_NUMBER_CALC = 3;
    private static final int GAME_NUMBER_GCD = 4;
    private static final int GAME_NUMBER_PROGRESSION = 5;
    private static final int GAME_NUMBER_PRIME = 6;

    private static final String GAME_SELECTION_PATTERN = """
            Please enter the game number and press Enter.
            1 - Greet
            2 - Even
            3 - Calc
            4 - GCD
            5 - Progression
            6 - Prime
            0 - Exit
            Your choice:\s""";

    public static void main(String[] args) {

        switch (Cli.getUserIntAnswer(GAME_SELECTION_PATTERN)) {
            case GAME_NUMBER_GREET -> {
                var game = new Greet();
                game.showGreeting();
            }
            case GAME_NUMBER_EVEN -> {
                var game = new Even();
                var gameEng = new Engine(game);
                gameEng.startGame();
            }
            case GAME_NUMBER_CALC -> {
                var game = new Calc();
                var gameEng = new Engine(game);
                gameEng.startGame();
            }
            case GAME_NUMBER_GCD -> {
                var game = new GCD();
                var gameEng = new Engine(game);
                gameEng.startGame();
            }
            case GAME_NUMBER_PROGRESSION -> {
                var game = new Progression();
                var gameEng = new Engine(game);
                gameEng.startGame();
            }
            case GAME_NUMBER_PRIME -> {
                var game = new Prime();
                var gameEng = new Engine(game);
                gameEng.startGame();
            }
            default -> System.out.println("Goodbye!");
        }
    }
}
