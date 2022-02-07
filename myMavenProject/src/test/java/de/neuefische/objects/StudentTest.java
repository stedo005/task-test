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

    @Test
    void testConstructor() {
        var student = new Student("André", "Schreck", 11);

        assertEquals("André", student.getFirstName());
        assertEquals("Schreck", student.getLastName());
        assertEquals(11, student.getSemester());
    }

    @Test
    void testCopy() {
        var student = new Student("André", "Schreck", 11);
        var result = new Student(student);

        assertEquals("André", result.getFirstName());
        assertEquals("Schreck", result.getLastName());
        assertEquals(11, result.getSemester());
    }

    @Test
    void testEquals() {
        var student = new Student();
        student.setLastName("Schreck");
        student.setFirstName("André");
        student.setSemester(11);

        assertEquals(new Student("André", "Schreck", 11), student);
    }

}