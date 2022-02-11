package de.neuefische.linkedlist;

class AnimalListItem {

    private final Animal value;
    private AnimalListItem next;

    AnimalListItem(Animal value) {
        this.value = value;
    }

    AnimalListItem getNext() {
        return next;
    }

    void setNext(AnimalListItem next) {
        this.next = next;
    }

    public String toString() {
        var result = value.toString();
        if (next != null) {
            result += " -> " + next;
        }
        return result;
    }

    public boolean hasNext() {
        return next != null;
    }

    public Animal getValue() {
        return value;
    }
}
