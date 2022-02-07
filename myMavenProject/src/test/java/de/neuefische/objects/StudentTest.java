package de.neuefische.objects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testLastName() {
        var student = new Student();
        student.setLastName("Schreck");
        assertEquals("Schreck", student.getLastName());
    }

    @Test
    void testFirstName() {
        var student = new Student();
        student.setFirstName("André");
        assertEquals("André", student.getFirstName());
    }

    @Test
    void testSemester() {
        var student = new Student();
        student.setSemester(5);
        assertEquals(5, student.getSemester());
    }

}