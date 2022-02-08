package de.neuefische.studentdb;

import java.util.Arrays;

public class StudentDB {

    private Student[] students;

    public StudentDB(Student[] inseredStudents) {
        this.students = inseredStudents;
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
        String result = "[";

        for (int i = 0; i < students.length; i++) {
            result += students[i];
            if (i < students.length -1)  {
                result += ", ";
            }
        }

        result += "]";

        return result;
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
