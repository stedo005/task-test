package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberCheckerTest {

    @Test
    void shouldDeclineNumberSmallerThan100() {
        // given
        var number = 50;

        // when
        boolean result = NumberChecker.checkNumber(number);

        // then
        assertFalse(result);
    }

    @Test
    void shouldDecline100() {
        // given
        var number = 100;

        // when
        boolean result = NumberChecker.checkNumber(number);

        // then
        assertFalse(result);
    }

    @Test
    void shouldAccept101() {
        // given
        var number = 101;

        // when
        boolean result = NumberChecker.checkNumber(number);

        // then
        assertTrue(result);
    }

    @Test
    void shouldAcceptNumberGreaterThan101() {
        // given
        var number = 150;

        // when
        boolean result = NumberChecker.checkNumber(number);

        // then
        assertTrue(result);
    }
}