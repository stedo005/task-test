package de.neuefische.inheritence;

public class HistoryStudent extends Student {

    public HistoryStudent(int id, String name) {
        super(id, name);
    }

    @Override
    public String getSubject() {
        return "History";
    }
}
