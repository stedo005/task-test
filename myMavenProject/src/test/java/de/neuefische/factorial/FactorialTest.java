package de.neuefische.factorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void testFacFor_0() {
        assertEquals(1, Factorial.facFor(0));
    }

    @Test
    void testFacFor_1() {
        assertEquals(1, Factorial.facFor(1));
    }

    @Test
    void testFacFor_2() {
        assertEquals(2, Factorial.facFor(2));
    }

    @Test
    void testFacFor_3() {
        assertEquals(6, Factorial.facFor(3));
    }

    @Test
    void testFacWhile_0() {
        assertEquals(1, Factorial.facWhile(0));
    }

    @Test
    void testFacWhile_1() {
        assertEquals(1, Factorial.facWhile(1));
    }

    @Test
    void testFacWhile_2() {
        assertEquals(2, Factorial.facWhile(2));
    }

    @Test
    void testFacWhile_3() {
        assertEquals(6, Factorial.facWhile(3));
    }

}