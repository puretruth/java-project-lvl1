package hexlet.code.gameEngine;

import hexlet.code.utils.Cli;

public class Engine {

    private static final String WELCOME_QUESTION = "Welcome to the Brain Games!\nMay I have your name? ";
    private static final String WELCOME_GREET_PATTERN = "Hello, %s!\n";
    private static final String CORRECT_ANSWER_RESPONSE = "Correct!\n";
    private static final String WIN_RESPONSE_PATTERN = "Congratulations, %s!\n";
    private static final String DEFEAT_RESPONSE_PATTERN = """
            '%s' is wrong answer ;(. Correct answer was '%s'.
            Let's try again, %s!
            """;
    private static final String LAP_QUESTION_PATTERN = "Question: %s\nYour answer: ";
    private static final int ROUNDS_NUMBER = 3;

    private String userName;
    private final Game game;

    public Engine(Game pGame) {
        this.game = pGame;
    }

    public void startGame() {
        // Приветствие
        showGreeting();
        // Показываем инициализирующий вопрос игры
        System.out.println(game.getStartQuestion());
        // В цикле задаём вопросы
        for (var i = 1; i <= ROUNDS_NUMBER; i++) {
            var gameQuestion = game.getLapQuestion();
            var lapQuestion = String.format(LAP_QUESTION_PATTERN, gameQuestion);
            var lapAnswer = Cli.getUserLineAnswer(lapQuestion);
            var gameLapAnswer = game.getLapAnswer();
            if (lapAnswer.equals(gameLapAnswer)) {
                System.out.println(CORRECT_ANSWER_RESPONSE);
            } else {
                System.out.printf(DEFEAT_RESPONSE_PATTERN, lapAnswer, gameLapAnswer, userName);
                return;
            }
        }
        // Получены корректные ответы на все вопросы
        System.out.printf(WIN_RESPONSE_PATTERN, userName);
    }
    public void showGreeting() {
        this.userName = Cli.getUserLineAnswer(WELCOME_QUESTION);
        System.out.printf(WELCOME_GREET_PATTERN, userName);
    }
}
