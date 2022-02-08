package de.neuefische.inheritence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HistoryStudentTest {

    @Test
    void testSubject() {
        HistoryStudent student = new HistoryStudent(1, "Name");
        assertEquals("History", student.getSubject());
    }
}