package de.neuefische.studentdb.map;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StudentDBTest {

    @Test
    void testThatAllStudentsAreReturned() {
        var studentDB = new StudentDB(List.of(new Student("eins", "eins", 1), new Student("zwei", "zwei", 2)));
        assertTrue(studentDB.list().containsAll(List.of(new Student("eins", "eins", 1), new Student("zwei", "zwei", 2))));
    }

    @Test
    void testThaAStudentIsAdded() {
        var studentDB = new StudentDB(List.of(new Student("eins", "eins", 1), new Student("zwei", "zwei", 2)));
        studentDB.addStudent(new Student("drei", "drei", 3));
        assertTrue(studentDB.list().containsAll(List.of(new Student("eins", "eins", 1), new Student("zwei", "zwei", 2), new Student("drei", "drei", 3))));
    }

    @Test
    void testThaAStudentIsRemoved() {
        var studentDB = new StudentDB(List.of(new Student("eins", "eins", 1), new Student("zwei", "zwei", 2), new Student("drei", "drei", 3)));
        studentDB.removeStudent("zwei zwei");
        assertTrue(studentDB.list().containsAll(List.of(new Student("eins", "eins", 1), new Student("drei", "drei", 3))));
    }

    @Test
    void testThaLastStudentIsRemoved() {
        var studentDB = new StudentDB(List.of(new Student("eins", "eins", 1), new Student("zwei", "zwei", 2), new Student("drei", "drei", 3)));
        studentDB.removeStudent("drei drei");
        assertTrue(studentDB.list().containsAll(List.of(new Student("eins", "eins", 1), new Student("zwei", "zwei", 2))));
    }

    @Test
    void testThaFirstStudentIsRemoved() {
        var studentDB = new StudentDB(List.of(new Student("eins", "eins", 1), new Student("zwei", "zwei", 2), new Student("drei", "drei", 3)));
        studentDB.removeStudent("eins eins");
        assertTrue(studentDB.list().containsAll(List.of(new Student("zwei", "zwei", 2), new Student("drei", "drei", 3))));
    }

    @Test
    void testThatThereAreNoDuplicateNames() {
        var studentToBeAddedTwice = new Student("zwei", "zwei", 2);
        var studentDB = new StudentDB(List.of(new Student("eins", "eins", 1), studentToBeAddedTwice, new Student("drei", "drei", 3)));
        assertThrows(RuntimeException.class, () -> studentDB.addStudent(studentToBeAddedTwice));
    }

    @Test
    void testThatStudentIsFound() {
        var studentToBeSearched = new Student("zwei", "zwei", 2);
        var studentDB = new StudentDB(List.of(new Student("eins", "eins", 1), studentToBeSearched, new Student("drei", "drei", 3)));
        assertEquals(studentToBeSearched, studentDB.findById(studentToBeSearched.getId()).orElseThrow());
    }

    @Test
    void testThatStudentIsNotFound() {
        var studentDB = new StudentDB(List.of(new Student("eins", "eins", 1), new Student("zwei", "zwei", 2), new Student("drei", "drei", 3)));
        assertFalse(studentDB.findById("anyId").isPresent());
    }
}