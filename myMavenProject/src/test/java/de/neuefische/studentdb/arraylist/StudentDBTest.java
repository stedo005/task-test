package de.neuefische.studentdb.arraylist;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class StudentDBTest {

    @Test
    void testThatAllStudentsAreReturned() {
        var studentDB = new StudentDB(List.of(new Student(), new Student()));
        assertEquals(List.of(new Student(), new Student()), studentDB.list());
    }

    @Test
    void testThaAStudentIsAdded() {
        var studentDB = new StudentDB(List.of(new Student(), new Student()));
        studentDB.addStudent(new Student());
        assertEquals(List.of(new Student(), new Student(), new Student()), studentDB.list());
    }

    @Test
    void testThaAStudentIsRemoved() {
        var studentDB = new StudentDB(List.of(new Student("eins", "eins", 1), new Student("zwei", "zwei", 2), new Student("drei", "drei", 3)));
        studentDB.removeStudent(1);
        assertEquals(List.of(new Student("eins", "eins", 1), new Student("drei", "drei", 3)), studentDB.list());
    }

    @Test
    void testThaLastStudentIsRemoved() {
        var studentDB = new StudentDB(List.of(new Student("eins", "eins", 1), new Student("zwei", "zwei", 2), new Student("drei", "drei", 3)));
        studentDB.removeStudent(2);
        assertEquals(List.of(new Student("eins", "eins", 1), new Student("zwei", "zwei", 2)), studentDB.list());
    }

    @Test
    void testThaFirstStudentIsRemoved() {
        var studentDB = new StudentDB(List.of(new Student("eins", "eins", 1), new Student("zwei", "zwei", 2), new Student("drei", "drei", 3)));
        studentDB.removeStudent(0);
        assertEquals(List.of(new Student("zwei", "zwei", 2), new Student("drei", "drei", 3)), studentDB.list());
    }

    @Test
    void testThaPassedIndexIsNotWithinBounds() {
        var studentDB = new StudentDB(List.of(new Student("eins", "eins", 1), new Student("zwei", "zwei", 2), new Student("drei", "drei", 3)));
        assertThrows(IndexOutOfBoundsException.class, () -> studentDB.removeStudent(3));
        assertThrows(IndexOutOfBoundsException.class, () -> studentDB.removeStudent(-1));
    }
}