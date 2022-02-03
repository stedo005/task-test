package de.neuefische.factorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void testFac_0() {
        assertEquals(1, Factorial.facFor(0));
    }

    @Test
    void testFac_1() {
        assertEquals(1, Factorial.facFor(1));
    }

    @Test
    void testFac_2() {
        assertEquals(2, Factorial.facFor(2));
    }

    @Test
    void testFac_3() {
        assertEquals(6, Factorial.facFor(3));
    }

}