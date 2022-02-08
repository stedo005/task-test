package de.neuefische.inheritence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerScienceStudentTest {

    @Test
    void testSubject() {
        ComputerScienceStudent student = new ComputerScienceStudent(1, "Name");
        assertEquals("Computer science", student.getSubject());
    }

}