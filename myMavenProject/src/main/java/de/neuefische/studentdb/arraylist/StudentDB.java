package de.neuefische.studentdb.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDB {

    private final List<Student> students = new ArrayList<>();

    public StudentDB(List<Student> students) {
        this.students.addAll(students);
    }

    public List<Student> list() {
        return Collections.unmodifiableList(students);
    }

    public Student randomStudent() {
        return students.get((int) (Math.random() * (students.size() - 1)));
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int index) {
        students.remove(index);
    }
}