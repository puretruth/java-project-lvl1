package hexlet.code.games;

import hexlet.code.utils.Cli;

public final class Greet {

    private String userName;

    public void setUserName(String pUserName) {
        this.userName = pUserName;
    }
    public String getUserName() {
        return this.userName;
    }

    public void showGreeting() {
        System.out.println("Welcome to the Brain Games!");
        var pUserName = Cli.getUserLineAnswer("May I have your name? ");
        System.out.printf("Hello, %s! \n", pUserName);
        setUserName(pUserName);
    }

}
