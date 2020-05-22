package io.c8y;

public class FizzBuzz {

    public String play(int i) {
        if (i % 3 == 0) {
            return "Fizz";
        } else {
            return String.valueOf(i);
        }
    }
}
