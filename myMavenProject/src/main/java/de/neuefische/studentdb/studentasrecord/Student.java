package de.neuefische.studentdb.studentasrecord;

public record Student(int id, String name) {

    @Override
    public String toString() {
        return "{id: " + id + ", name: " + name + "}";
    }
}
