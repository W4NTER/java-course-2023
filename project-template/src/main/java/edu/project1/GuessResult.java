package edu.project1;

import org.jetbrains.annotations.NotNull;

public interface GuessResult {
    char[] state();
    int attempt();
    int maxAttempts();
    @NotNull String message();

    record Defeat(int maxAttempts) implements GuessResult {
        @Override
        public char[] state() {
            return new char[0];
        }

        @Override
        public int attempt() {
            return maxAttempts;
        }

        @Override
        public int maxAttempts() {
            return 0;
        }

        @Override
        public @NotNull String message() {
            return "You lost!";
        }
    }
    record Win(char[] userAnswer, int maxAttempts) implements GuessResult {
        @Override
        public char[] state() {
            return userAnswer;
        }

        @Override
        public int attempt() {
            return maxAttempts;
        }

        @Override
        public int maxAttempts() {
            return 0;
        }

        @Override
        public @NotNull String message() {
            return "You won!";
        }
    }
    record SuccessfulGuess(int attempts, int maxAttempts, char[] userAnswer) implements GuessResult {
        @Override
        public char[] state() {
            return userAnswer;
        }

        @Override
        public int attempt() {
            return attempts;
        }

        @Override
        public int maxAttempts() {
            return maxAttempts;
        }

        @Override
        public @NotNull String message() {
            return "Hit!";
        }
    }
    record FailedGuess(int attempts, int maxAttempts, char[] userAnswer) implements GuessResult {
        @Override
        public char[] state() {
            return userAnswer;
        }

        @Override
        public int attempt() {
            return attempts + 1;
        }

        @Override
        public int maxAttempts() {
            return maxAttempts;
        }

        @Override
        public @NotNull String message() {
            return String.format("Missed, mistake %d out of %d", attempts + 1, maxAttempts);
        }
    }
}
