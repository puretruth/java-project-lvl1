package hexlet.code;


import hexlet.code.games.Calc;

public class Engine <T>{

    // Константы
    static final private String WELCOME_QUESTION = "Welcome to the Brain Games!\nMay I have your name? ";
    static final private String WELCOME_GREET_PATTERN = "Hello, %s!\n";
    static final private String CORRECT_ANSWER_RESPONSE = "Correct!\n";
//    static final private String WRONG_ANSWER_RESPONSE_PATTERN = "%s is wrong answer ;(. Correct answer was %s.";
    static final private String WIN_RESPONSE_PATTERN = "Congratulations, %s!\n";
    static final private String DEFEAT_RESPONSE_PATTERN = """
            '%s' is wrong answer ;(. Correct answer was '%s'.
            Let's try again, %s!\n""";
    static final private String LAP_QUESTION_PATTERN = "Question: %s\nYour answer: ";
    static final private int ROUNDS_NUMBER = 3;

    private String userName;
//    private String gameStartQuestion;
    private String gameRoundQuestionPattern;
    private T game;

    Engine(T game) {
        this.game = game;
    }

    public <T> void startGame() {
        // Приветствие
        showGreeting();
        // Показываем инициализирующий вопрос игры
        System.out.println((String) game.GAME_START_QUESTION);
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
