package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Greet;
import hexlet.code.games.Calc;

public class App {

    private static final String GAME_SELECTION_PATTERN = """
            Please enter the game number and press Enter.
            1 - Greet
            2 - Even
            3 - Calc
            0 - Exit
            Your choice:\s""";

    public static void main(String[] args) {

        switch (Cli.getUserIntAnswer(GAME_SELECTION_PATTERN)) {
            case 1 -> {// greet
                var greet = new Greet();
                greet.showGreeting();
            }
            case 2 -> {// even
                var evenGame = new Even();
                var evenEng = new Engine(evenGame);
                evenEng.startGame();
            }
            case 3 -> {// calc
                var calcGame = new Calc();
                var calcEng = new Engine(calcGame);
                calcEng.startGame();
            }
            default -> System.out.println("Goodbye!");// exit
        }
    }
}
