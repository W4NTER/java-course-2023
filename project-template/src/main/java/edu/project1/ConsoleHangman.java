package edu.project1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Arrays;
import java.util.Scanner;


public class ConsoleHangman {
    private final static Logger LOGGER = LogManager.getLogger();
    private final static int MAX_ATTEMPTS = 5;
    private final static int START_ATTEMPTS = 0;
    private final static String ANSWER = new ChooseWord().randomWord();
    private final static char[] START_USER_ANSWER = new char[ANSWER.length()];

    public void run() {
        Scanner command = new Scanner(System.in);
        Arrays.fill(START_USER_ANSWER, '*');
        Session session = new Session(ANSWER, START_USER_ANSWER, MAX_ATTEMPTS, START_ATTEMPTS);
        GuessResult guessResult;
        try {
            while (session.getAttempts() != -1) {
                LOGGER.info("Guess a letter:");
                String guess = command.nextLine();
                guessResult = tryGuess(session, guess);
                session.setAttempts(guessResult.attempt());

                LOGGER.info(guessResult.message());
                LOGGER.info("The word: " + String.valueOf(guessResult.state()));
            }
        } catch (StringIndexOutOfBoundsException e) {
            LOGGER.info("You entered an empty line");
        }
        command.close();
    }

    private GuessResult tryGuess(Session session, String input) {
        if (input.length() > 1) {
            return session.giveUp(input);
        } else {
            return session.guess(input.charAt(0));
        }
    }

    private void printState(GuessResult guess) {
        LOGGER.info(guess.message());
    }
}
