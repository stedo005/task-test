package de.neuefische.inheritence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StudentDBForInheritanceTest {

    @Test
    void shouldMakeSureThatStudentsCanBeRetrieved() {
        // given
        Student[] students = { new ComputerScienceStudent(1, "André Schreck"), new HistoryStudent(2, "Thomas Kittlaus") };
        StudentDBForInheritance studentDB = new StudentDBForInheritance(students);

        // when
        Student[] actual = studentDB.list();

        // then
        Assertions.assertArrayEquals(students, actual);

        Assertions.assertEquals(1, actual[0].getId());
        Assertions.assertEquals("André Schreck", actual[0].getName());
    }

    @Test
    void shouldReturnRandomStudent() {
        // given
        Student[] students = { new ComputerScienceStudent(1, "André Schreck"), new HistoryStudent(2, "Thomas Kittlaus") };
        StudentDBForInheritance studentDB = new StudentDBForInheritance(students);

        // when
        Student student = studentDB.randomStudent();

        // then
        Assertions.assertNotNull(student);
    }

    @Test
    void shouldReturnStringRepresentation() {
        // given
        Student[] students = { new ComputerScienceStudent(1, "André Schreck"), new HistoryStudent(2, "Thomas Kittlaus") };
        StudentDBForInheritance studentDB = new StudentDBForInheritance(students);

        // when
        String actual = studentDB.toString();

        // then
        Assertions.assertEquals("[{id: 1, name: André Schreck}, {id: 2, name: Thomas Kittlaus}]", actual);
    }

    @Test
    void shouldAddNewStudent() {
        // given
        Student[] students = { new ComputerScienceStudent(1, "André Schreck") };
        StudentDBForInheritance studentDB = new StudentDBForInheritance(students);

        // when
        studentDB.add(new HistoryStudent(2, "Thomas Kittlaus"));
        Student[] actual = studentDB.list();

        // then
        Student[] expected = { new ComputerScienceStudent(1, "André Schreck"), new HistoryStudent(2, "Thomas Kittlaus") };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveFirstStudent() {
        // given
        Student[] students = { new ComputerScienceStudent(1, "André Schreck"), new HistoryStudent(2, "Thomas Kittlaus") };
        StudentDBForInheritance studentDB = new StudentDBForInheritance(students);

        // when
        studentDB.remove(0);
        Student[] actual = studentDB.list();

        // then
        Student[] expected = { new HistoryStudent(2, "Thomas Kittlaus") };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveLastStudent() {
        // given
        Student[] students = { new ComputerScienceStudent(1, "André Schreck"), new HistoryStudent(2, "Thomas Kittlaus") };
        StudentDBForInheritance studentDB = new StudentDBForInheritance(students);

        // when
        studentDB.remove(1);
        Student[] actual = studentDB.list();

        // then
        Student[] expected = { new ComputerScienceStudent(1, "André Schreck") };
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveIntermediateStudent() {
        // given
        Student[] students = { new ComputerScienceStudent(1, "André Schreck"), new HistoryStudent(2, "Max Mustermann"), new ComputerScienceStudent(3, "Thomas Kittlaus") };
        StudentDBForInheritance studentDB = new StudentDBForInheritance(students);

        // when
        studentDB.remove(1);
        Student[] actual = studentDB.list();

        // then
        Student[] expected = { new ComputerScienceStudent(1, "André Schreck"), new ComputerScienceStudent(3, "Thomas Kittlaus") };
        Assertions.assertArrayEquals(expected, actual);
    }

}