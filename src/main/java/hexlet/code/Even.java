package hexlet.code;

import java.util.Random;
import hexlet.code.Cli;

public class Even {
    public static void startGame(String userName) {

        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

        var randomGenerator = new Random();
        var loopsForWinCount = 3;

        for (var i = 1; i <= loopsForWinCount; i++) {
            var number = randomGenerator.nextInt();
            var answer = Cli.getUserLineAnswer(getQuestion(number));
            var answerCorrect = isAnswerCorrect(answer, number);
            if (!answerCorrect) {
                System.out.println(getGameOver(userName));
                return;
            }
            System.out.println("Correct!");
        }
        System.out.println(getWin(userName));
    }

    private static String getQuestion(int number) {
        var questionPattern = """
                Question: %s
                Your answer:\s""";
        var question = String.format(questionPattern, number);

        return question;
    }

    private static boolean isAnswerCorrect(String answer, int number) {
        var numberIsEven = (number % 2) == 0;
        switch (answer) {
            case "yes":
                return numberIsEven;
            case "no":
                return !numberIsEven;
            default:
                return false;
        }
    }

    private static String getGameOver(String userName) {
        var gameOverPattern = """
                'yes' is wrong answer ;(. Correct answer was 'no'.
                Let's try again, %s!
                """;
        return String.format(gameOverPattern, userName);
    }

    private static String getWin(String userName) {
        var winPattern = "Congratulations, %s!";
        return String.format(winPattern, userName);
    }


}