package io.c8y;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    public void shouldReturnANumberWhenItsNotFizzOrBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result =  fizzBuzz.play(7);

        assertEquals( "7", result );
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12})
    public void shouldReturnFizzWhenNumberMultiplicationOfThree(int number) {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String string = fizzBuzz.play(number);

        assertEquals("Fizz", string );
    }
}
