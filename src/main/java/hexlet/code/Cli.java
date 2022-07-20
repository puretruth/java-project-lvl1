package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String getUserNameAnswer(String questionText) {

        var input = new Scanner(System.in);
        System.out.print(questionText);
        var userName = input.nextLine();

        return userName;
    }
}
