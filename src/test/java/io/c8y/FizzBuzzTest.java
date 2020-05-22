package io.c8y;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    public void shouldReturnANumberWhenItsNotFizzOrBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result =  fizzBuzz.play(7);

        assertEquals( result, "7" );
    }

}
