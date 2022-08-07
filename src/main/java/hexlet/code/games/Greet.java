package hexlet.code.games;

import hexlet.code.utils.Cli;

public class Greet {

    private String userName;

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserName() {
        return this.userName;
    }

    public void showGreeting() {
        System.out.println("Welcome to the Brain Games!");
        var userName = Cli.getUserLineAnswer("Let me know your name? ");
        System.out.printf("Hello, %s! \n", userName);
        setUserName(userName);
    }

}
