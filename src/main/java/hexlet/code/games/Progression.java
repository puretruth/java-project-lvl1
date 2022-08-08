package hexlet.code.games;

import hexlet.code.gameEngine.Game;
import java.util.Random;

public class Progression  implements Game {

    public static final String GAME_START_QUESTION = "What number is missing in the progression?";
    public static final int LENGTH_SEED = 7;
    public static final int LENGTH_ADDITION = 5;
    public static final int FIRST_ELEMENT_SEED = 100;
    public static final int STEP_SEED = 100;

    private Random randomGenerator;
    private String lapAnswer;

    public Progression() {
        randomGenerator = new Random();
    }

    public String getStartQuestion() {
        return GAME_START_QUESTION;
    }

    public String getLapQuestion() {

        var progression = getProgression();
        var hiddenElementIndex = randomGenerator.nextInt(progression.length);
        lapAnswer = progression[hiddenElementIndex];
        progression[hiddenElementIndex] = "..";
        var question = String.join(" ", progression);

        return question;
    }

    public String getLapAnswer() {
        return lapAnswer;
    }

    private String[] getProgression() {

        var progressionLength = randomGenerator.nextInt(LENGTH_SEED) + LENGTH_ADDITION;
        var progression = new String[progressionLength];
        var firstElement = randomGenerator.nextInt(FIRST_ELEMENT_SEED);
        var step = randomGenerator.nextInt(STEP_SEED);

        for (var i = 0; i < progressionLength; i++) {
            progression[i] = Integer.toString(firstElement + step * i);
        }

        return progression;
    }

}
