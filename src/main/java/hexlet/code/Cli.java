package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String getUserLineAnswer(String questionText) {

        var input = new Scanner(System.in);
        System.out.print(questionText);
        var answer = input.nextLine();

        return answer;
    }

    public static int getUserIntAnswer(String questionText) {

        var input = new Scanner(System.in);
        System.out.print(questionText);
        return input.nextInt();

    }
}
