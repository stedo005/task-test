package de.neuefische.objects;

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
}
