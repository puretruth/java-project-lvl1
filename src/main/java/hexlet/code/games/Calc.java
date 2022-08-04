package hexlet.code.games;

import java.util.Random;

public class Calc implements Game {
    public static final String GAME_START_QUESTION = "What is the result of the expression?";
    private static final int MAX_OPERAND_VALUE = 100;
    private static final String[] OPERATORS = {"+", "-", "*"};
    public static final String LAP_QUESTION_PATTERN = "%s %s %s";

    private Random operandRandomGenerator;
    private String lapAnswer;

    public Calc() {
        operandRandomGenerator = new Random();
    }
    public String getStartQuestion() {
        return GAME_START_QUESTION;
    }

    public String getLapQuestion() {
        var operand1 = operandRandomGenerator.nextInt(MAX_OPERAND_VALUE);
        var operand2 = operandRandomGenerator.nextInt(MAX_OPERAND_VALUE);
        var operatorIndex = operandRandomGenerator.nextInt(OPERATORS.length);

        var operator = OPERATORS[operatorIndex];
        int lapAnswerInt;
        switch (operator) {
            case "+":
                lapAnswerInt = operand1 + operand2;
                break;
            case "-":
                lapAnswerInt = operand1 - operand2;
                break;
            case "*":
                lapAnswerInt = operand1 * operand2;
                break;
            default:
                lapAnswerInt = 0;// не найден оператор?
        }
        lapAnswer = Integer.toString(lapAnswerInt);
        var question = String.format(LAP_QUESTION_PATTERN, operand1, operator, operand2);
        return question;
    }

    public String getLapAnswer() {
        return lapAnswer;
    }
}
