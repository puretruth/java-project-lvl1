package hexlet.code;

public class App {
    public static void main(String[] args) {

        Greet greet;

        var gameNumber = getGameNumberFromUser();

        switch (gameNumber) {
            case 0:
                System.out.println("Goodbye!");
                return;
            case 1:
                greet = new Greet();
                greet.showGreeting();
                break;
            case 2:
                greet = new Greet();
                greet.showGreeting();
                Even.startGame(greet.getUserName());
                break;
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
