package hexlet.code;

public class Greet {

    public static void showGreeting() {
        System.out.println("Welcome to the Brain Games!");
        var userName = Cli.getUserLineAnswer("Let me know your name? ");
        System.out.printf("Hello, %s! \n", userName);
    }

}
