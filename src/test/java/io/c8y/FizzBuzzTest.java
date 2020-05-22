package io.c8y;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @BeforeEach
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldReturnANumberWhenItsNotFizzOrBuzz() {
        String result = fizzBuzz.play(7);

        assertEquals("7", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12})
    public void shouldReturnFizzWhenNumberMultiplicationOfThree(int number) {
        String string = fizzBuzz.play(number);

        assertEquals("Fizz", string);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 15, 20})
    public void  shouldReturnBuzzWhenNumberMultiplicationOfFive(int number) {
        String string = fizzBuzz.play(number);

        assertEquals("Buzz", string);
    }

    
}
