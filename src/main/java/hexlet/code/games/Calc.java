package hexlet.code.games;

import java.util.Random;

public class Calc {

    public static final String GAME_START_QUESTION = "What is the result of the expression?";
    private static final int MAX_OPERAND_VALUE = 100;

    private int operatorsCount;
    private Random operandRandomGenerator;
    private Random operatorRandomGenerator;

    Calc() {
        operandRandomGenerator = new Random();
    }

    private String getQuestion() {
        var operand1 = operandRandomGenerator.nextInt(MAX_OPERAND_VALUE);
        var operand2 = operandRandomGenerator.nextInt(MAX_OPERAND_VALUE);
        var operator = operandRandomGenerator.nextInt(MAX_OPERAND_VALUE);


        return GAME_START_QUESTION;
    }
}
