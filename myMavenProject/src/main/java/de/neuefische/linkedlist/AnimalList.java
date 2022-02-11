package de.neuefische.linkedlist;

public class AnimalList {

    private AnimalListItem head;

    public void add(Animal animal) {
        if (head == null) {
            head = new AnimalListItem(animal);
        } else {
            var current = head;
            while (current.hasNext()) {
                current = current.getNext();
            }
            current.setNext(new AnimalListItem(animal));
        }
    }

    public void remove(Animal animal) {
        var prev = (AnimalListItem) null;
        for (AnimalListItem current = head; current != null; current = current.getNext()) {
            if (animal.equals(current.getValue())) {
                if (prev == null) {
                    head = head.getNext();
                } else {
                    prev.setNext(current.getNext());
                }
                break;
            }
            prev = current;
        }
    }

    @Override
    public String toString() {
        return head.toString();
    }
}