package hexlet.code;


import hexlet.code.games.Calc;

public class Engine {

    // Константы
    static final private String WELCOME_QUESTION = "Welcome to the Brain Games!\nMay I have your name? ";
    static final private String WELCOME_GREET_PATTERN = "Hello, %s!\n";
    static final private String CORRECT_ANSWER_RESPONSE = "Correct!";
    static final private String WRONG_ANSWER_RESPONSE_PATTERN = "%s is wrong answer ;(. Correct answer was %s.";
    static final private String WIN_RESPONSE_PATTERN = "Congratulations, %s!";
    static final private String DEFEAT_RESPONSE_PATTERN = "Let's try again, %s!";
    static final private String GAME_QUESTION_PATTERN = "Question: %s\nYour answer: ";
    static final private int ROUNDS_NUMBER = 3;

    private String userName;
//    private String gameStartQuestion;
    private String gameRoundQuestionPattern;

    Engine(Calc game) {
//        this.gameStartQuestion = game.GAME_START_QUESTION;
    }

    public void startGame(Calc game) {
        // Показываем инициализирующий вопрос игры
        System.out.println(game.GAME_START_QUESTION);

        // В цикле задаём вопросы
        for (var i = 1; i <= ROUNDS_NUMBER; i++) {
            //game.getQuestion();
        }

    }
    public void showGreeting() {

        this.userName = Cli.getUserLineAnswer(WELCOME_QUESTION);
        System.out.printf(WELCOME_GREET_PATTERN, userName);
    }




}
