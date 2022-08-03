package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Greet;
import hexlet.code.games.Calc;

public class App {

    static final private String GAME_SELECTION_PATTERN = """
            Please enter the game number and press Enter.
            1 - Greet
            2 - Even
            3 - Calc
            0 - Exit
            Your choice: """;

    public static void main(String[] args) {

        Greet greet;

        var gameNumber = getGameNumberFromUser();

        switch (gameNumber) {
            case 1:// greet
                greet = new Greet();
                greet.showGreeting();
                break;
            case 2:// even
                greet = new Greet();
                greet.showGreeting();
                Even.startGame(greet.getUserName());
                break;
            case 3:// calc
                var calcGame = new Calc();
                var calcEng = new Engine(calcGame);
                calcEng.startGame();
                break;
            default:// exit
                System.out.println("Goodbye!");
                return;
        };


    }
    private  static int getGameNumberFromUser() {
        var questionText =
                """
                        Please enter the game number and press Enter.
                        1 - Greet
                        2 - Even
                        0 - Exit
                        Your choice:\s""";
        var gameNumber = Cli.getUserIntAnswer(questionText);

        return gameNumber;
    }

}
