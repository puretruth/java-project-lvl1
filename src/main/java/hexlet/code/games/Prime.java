package hexlet.code.games;

import java.util.Random;
import hexlet.code.gameEngine.Game;
import hexlet.code.utils.Math;

public class Prime implements Game {

    public static final String GAME_START_QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static final int PRIMES_UPPER_EDGE = 50;

    private Random randomGenerator;
    private String lapAnswer;
    private boolean[] primes;

    public Prime() {
        randomGenerator = new Random();
        primes = Math.primes(PRIMES_UPPER_EDGE);
    }

    public String getStartQuestion() {
        return GAME_START_QUESTION;
    }

    public String getLapQuestion() {

        var questionNumber = randomGenerator.nextInt(PRIMES_UPPER_EDGE);
        lapAnswer = primes[questionNumber] ? "yes" : "no";
        var question = Integer.toString(questionNumber);

        return question;
    }

    public String getLapAnswer() {
        return lapAnswer;
    }

}
