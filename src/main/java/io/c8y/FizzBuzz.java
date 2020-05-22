package io.c8y;


public class FizzBuzz {

    public String play(int i) throws IllegalArgumentException {
        if (i<0 || i == 0|| i>=100) {
            throw new IllegalArgumentException();
        }
        if (i % 3 == 0) {
            return "Fizz";
        }else if (i % 5 == 0) {
            return "Buzz";
        } else {

            return String.valueOf(i);
        }

    }
}
