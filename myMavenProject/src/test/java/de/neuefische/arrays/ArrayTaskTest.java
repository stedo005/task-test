package de.neuefische.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTaskTest {

    @Test
    void shouldFillArray() {
        String[] result = ArrayTask.fillArray(4);
        assertArrayEquals(new String[] {"Student 0", "Student 1", "Student 2", "Student 3"}, result);
    }
}