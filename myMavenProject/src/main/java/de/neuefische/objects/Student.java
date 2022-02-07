package de.neuefische.objects;

import java.util.Objects;

public class Student {

    private String firstName;
    private String lastName;
    private int semester;

    Student(String firstName, String lastName, int semester) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.semester = semester;
    }

    Student(Student toCopy) {
        this.firstName = toCopy.getFirstName();
        this.lastName = toCopy.getLastName();
        this.semester = toCopy.getSemester();
    }

    Student() {}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", semester=" + semester +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return semester == student.semester && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, semester);
    }
}
