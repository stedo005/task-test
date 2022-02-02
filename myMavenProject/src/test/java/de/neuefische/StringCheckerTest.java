package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringCheckerTest {

    @Test
    void shouldFailIfTheStringHasLessThan20Characters() {
        // given
        String input = "1234567890123456789";

        // when
        boolean result = StringChecker.checkString(input);

        // then
        assertFalse(result);
    }

    @Test
    void shouldFailIfTheStringHasExactly20Characters() {
        // given
        String input = "12345678901234567890";

        // when
        boolean result = StringChecker.checkString(input);

        // then
        assertFalse(result);
    }

    @Test
    void shouldFailIfTheStringDoesNotContainFancy() {
        // given
        String input = "123456789012345678901";

        // when
        boolean result = StringChecker.checkString(input);

        // then
        assertFalse(result);
    }

    @Test
    void shouldSucceedIfTheStringHasMoreThat20CharactersAndContainsFancy() {
        // given
        String input = "1234567890fancy12345678901";

        // when
        boolean result = StringChecker.checkString(input);

        // then
        assertTrue(result);
    }

}