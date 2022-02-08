package de.neuefische.interfaces;

import java.util.Arrays;

public class StudentDBForInterfaces {

    private Student[] students;

    public StudentDBForInterfaces(Student[] insertedStudents) {
        this.students = insertedStudents;
    }

    public Student[] list() {
        return students;
    }

    public Student randomStudent() {
        int maxIndex = students.length - 1;
        return students[(int) (Math.random() * maxIndex)];
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i < students.length; i++) {
            result.append(students[i]);
            if (i < students.length -1)  {
                result.append(", ");
            }
        }

        result.append("]");

        return result.toString();
    }

    public void add(Student newStudent) {
        Student[] newStudents = Arrays.copyOf(students, students.length + 1);
        newStudents[newStudents.length - 1] = newStudent;
        this.students = newStudents;
    }

    public void remove(int i) {
        Student[] newStudents = Arrays.copyOf(students, students.length - 1);
        System.arraycopy(students, 0, newStudents, 0, i);
        System.arraycopy(students, i + 1, newStudents, i, students.length - (i + 1));
        this.students = newStudents;
    }
}
