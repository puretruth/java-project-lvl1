package hexlet.code;

public class App {
    public static void main(String[] args) {
        showGreeting();
        var userName = Cli.getUserNameAnswer("Let me know your name? ");
        showUserGreeting(userName);

    }
    private static void showGreeting() {
        System.out.println("Welcome to the Brain Games!");
    }
    private static void showUserGreeting(String userName) {
        System.out.printf("Hello, %s! \n", userName);
    }

}
