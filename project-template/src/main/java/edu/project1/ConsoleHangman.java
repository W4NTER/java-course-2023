package edu.project1;

import java.util.Arrays;
import java.util.Scanner;
import edu.project1.GuessResult.*;


public class ConsoleHangman {
    private final static int MAX_ATTEMPTS = 5;
    public void run() {
        Scanner command = new Scanner(System.in);
        ChooseWord chooseWord = new ChooseWord();
        String answer = chooseWord.randomWord();
        var userAnswer = new char[answer.length()];
        Arrays.fill(userAnswer, '*');
        int attempts = 0;
        Session session = new Session(answer, userAnswer, MAX_ATTEMPTS, attempts);
        GuessResult guessResult = tryGuess(session, " ");
        while (guessResult.attempt() != MAX_ATTEMPTS) {
            System.out.println("Guess a letter:");
            String guess = command.nextLine();
            guessResult = tryGuess(session, guess);
            session.setAttempts(guessResult.attempt());

            System.out.println(guessResult.message());
            System.out.println("The word: " + String.valueOf(guessResult.state()));
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
        System.out.println(guess.message());
    }
}
