package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Greet;

public class App {
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
