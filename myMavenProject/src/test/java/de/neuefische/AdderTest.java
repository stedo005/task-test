package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdderTest {

    @Test
    void shouldAddTwoPositiveNumbers() {
        // given
        var number1 = 36;
        var number2 = 15;

        // when
        int result = Adder.add(number1, number2);

        // then
        assertEquals(51, result);
    }

    @Test
    void shouldAddTwoNegativeNumbers() {
        // given
        var number1 = -36;
        var number2 = -15;

        // when
        int result = Adder.add(number1, number2);

        // then
        assertEquals(-51, result);
    }

    @Test
    void shouldAddANegativeAndAPositiveNumbers() {
        // given
        var number1 = -36;
        var number2 = 15;

        // when
        int result = Adder.add(number1, number2);

        // then
        assertEquals(-21, result);
    }

    @Test
    void shouldAddAPositiveAndANegativeNumbers() {
        // given
        var number1 = 36;
        var number2 = -15;

        // when
        int result = Adder.add(number1, number2);

        // then
        assertEquals(21, result);
    }

}