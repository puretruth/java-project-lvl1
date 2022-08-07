package hexlet.code.games;

import hexlet.code.gameEngine.Game;

import java.util.Random;
//import hexlet.code.utils.Cli;

public class Even implements Game {
    public static final String GAME_START_QUESTION = "Answer 'yes' if number even otherwise answer 'no'.";
    public static final String LAP_QUESTION_PATTERN = "%s";

    private Random randomGenerator;
    private String lapAnswer;

    public Even() {
        randomGenerator = new Random();
    }
    public String getStartQuestion() {
        return GAME_START_QUESTION;
    }

    public String getLapQuestion() {
        var number = randomGenerator.nextInt();
        var question = String.format(LAP_QUESTION_PATTERN, number);
        lapAnswer = ((number % 2) == 0) ? "yes" : "no";

        return question;
    }

    public String getLapAnswer() {
        return lapAnswer;
    }
}