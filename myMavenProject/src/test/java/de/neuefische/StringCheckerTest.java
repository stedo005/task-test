package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringCheckerTest {

    @Test
    void shouldFailIfTheStringHasLessThan20Characters() {
        Assertions.assertFalse(StringChecker.checkString("1234567890123456789"));
    }

    @Test
    void shouldFailIfTheStringHasExactly20Characters() {
        Assertions.assertFalse(StringChecker.checkString("12345678901234567890"));
    }

    @Test
    void shouldFailIfTheStringDoesNotContainFancy() {
        Assertions.assertFalse(StringChecker.checkString("123456789012345678901"));
    }

    @Test
    void shouldSucceedIfTheStringHasMoreThat20CharactersAndContainsFancy() {
        Assertions.assertTrue(StringChecker.checkString("1234567890fancy12345678901"));
    }

}