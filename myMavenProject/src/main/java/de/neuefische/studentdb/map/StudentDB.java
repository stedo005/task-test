package de.neuefische.studentdb.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class StudentDB {

    private final Map<String, Student> students = new HashMap<>();

    public StudentDB(List<Student> students) {
        for (Student student : students) {
            this.students.put(student.getId(), student);
        }
    }

    public List<Student> list() {
        return List.copyOf(students.values());
    }

    public Student randomStudent() {
        return list().get((int) (Math.random() * (students.size() - 1)));
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }

    public void addStudent(Student student) {
        if (students.containsKey(student.getId())) {
            throw new RuntimeException("student is already present");
        }
        students.put(student.getId(), student);
    }

    public void removeStudent(String fullName) {
        students.remove(fullName);
    }

    public Optional<Student> findById(String id) {
        return Optional.ofNullable(students.get(id));
    }

    public void printIds() {
        students.keySet().forEach(System.out::println);
    }
}
