package io.c8y;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.platform.commons.util.ExceptionUtils;

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
    @ValueSource(ints = {5, 10, 20})
    public void shouldReturnBuzzWhenNumberMultiplicationOfFive(int number) {
        String string = fizzBuzz.play(number);

        assertEquals("Buzz", string);
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45, 60})
    public void shouldReturnFizzBuzzWhenNumberMultiplicationOfThreeAndFive(int number) {
        String string = fizzBuzz.play(number);

        assertEquals("FizzBuzz", string);
    }



    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 100, 200})
    public void shouldThrowExceptionWhenInputParameterIsNotInScope(int number) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> fizzBuzz.play(number));
    }
}
