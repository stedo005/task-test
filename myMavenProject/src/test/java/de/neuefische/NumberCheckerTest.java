package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberCheckerTest {

    @Test
    void shouldBeDividableByTwo() {
        Assertions.assertTrue(NumberChecker.checkNumber(4));
    }

    @Test
    void shouldNotBeDividableByTwo() {
        Assertions.assertFalse(NumberChecker.checkNumber(5));
    }

}