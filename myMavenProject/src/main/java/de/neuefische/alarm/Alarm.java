package de.neuefische.alarm;

public class Alarm {

    public static String check(int numberOfPeople) {
        if (numberOfPeople > 30) {
            return "Zu viele Personen";
        }
        return "Maximale Personenanzahl nicht überschritten";
    }

}
