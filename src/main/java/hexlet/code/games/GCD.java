package hexlet.code.games;

import hexlet.code.gameEngine.Game;
import static hexlet.code.utils.Math.gcd;
import java.util.Random;

public class GCD  implements Game {

    public static final String GAME_START_QUESTION = "Find the greatest common divisor of given numbers.";
    public static final String LAP_QUESTION_PATTERN = "%s %s";
    private static final int MAX_OPERAND_VALUE = 100;

    private Random operandRandomGenerator;
    private String lapAnswer;

    public GCD() {
        operandRandomGenerator = new Random();
    }
    public String getStartQuestion() {
        return GAME_START_QUESTION;
    }

    public String getLapQuestion() {
        var operand1 = operandRandomGenerator.nextInt(MAX_OPERAND_VALUE);
        var operand2 = operandRandomGenerator.nextInt(MAX_OPERAND_VALUE);

        var lapAnswerInt = gcd(operand1, operand2);
        lapAnswer = Integer.toString(lapAnswerInt);
        var question = String.format(LAP_QUESTION_PATTERN, operand1, operand2);
        return question;
    }

    public String getLapAnswer() {
        return lapAnswer;
    }


}
