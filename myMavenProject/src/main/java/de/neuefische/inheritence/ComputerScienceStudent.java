package de.neuefische.inheritence;

public class ComputerScienceStudent extends Student {

    public ComputerScienceStudent(int id, String name) {
        super(id, name);
    }

    @Override
    public String getSubject() {
        return "Computer science";
    }

}
