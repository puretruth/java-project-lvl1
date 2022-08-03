package hexlet.code.games;

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
            var correctAnswer = getCorrectAnswer(answer, number);
            if (!answer.equals(correctAnswer)) {
                System.out.println(getGameOver(answer, correctAnswer, userName));
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

    private static String getCorrectAnswer(String answer, int number) {
        String correctAnswer;
        var numberIsEven = (number % 2) == 0;

        if(numberIsEven) {
            correctAnswer = "yes";
        } else {
            correctAnswer = "no";
        }

        return correctAnswer;
    }

    private static String getGameOver(String answer, String correctAnswer, String userName) {
        var gameOverPattern = """
                '%s' is wrong answer ;(. Correct answer was '%s'.
                Let's try again, %s!
                """;
        return String.format(gameOverPattern, answer, correctAnswer, userName);
    }

    private static String getWin(String userName) {
        var winPattern = "Congratulations, %s!";
        return String.format(winPattern, userName);
    }


}