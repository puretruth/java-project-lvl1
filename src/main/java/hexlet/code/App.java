package hexlet.code;

public class App {
    public static void main(String[] args) {

        var gameNumber = getGameNumberFromUser();

        switch (gameNumber) {
            case 0:
                System.out.println("Goodbye!");
                return;
            case 1:
                Greet.showGreeting();
                break;
            case 2:
                Even.startGame();
                break;
        };


    }
    private  static int getGameNumberFromUser() {
        var questionText =
                """
                        Please enter the game number and press Enter.
                        1 - Greet
                        0 - Exit
                        Your choice:\s""";
        var gameNumber = Cli.getUserIntAnswer(questionText);

        return gameNumber;
    }

}
