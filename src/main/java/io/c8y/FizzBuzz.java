package io.c8y;


public class FizzBuzz {

    public String play(int number) throws IllegalArgumentException {
        validate(number);
        if (isFizz(number) && isBuzz(number)) {
            return "FizzBuzz";
        }
        if (isFizz(number)) {
            return "Fizz";
        }
        if (isBuzz(number)) {
            return "Buzz";
        }
        return String.valueOf(number);

    }

    private boolean isBuzz(int number) {
        return number % 5 == 0;
    }

    private boolean isFizz(int number) {
        return number % 3 == 0;
    }


    private void validate(int number) {
        if (number <= 0 || number >= 100) {
            throw new IllegalArgumentException();
        }
    }
}
