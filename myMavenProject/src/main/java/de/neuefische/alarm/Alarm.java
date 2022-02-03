package de.neuefische.alarm;

public class Alarm {

    private static final String WARNING_MESSAGE = "Zu viele Personen";
    private static final String OK_MESSAGE = "Maximale Personenzahl nicht überschritten";

    public static String checkNumberOfCustomers(int numberOfCustomers, String alarmLevel) {
        switch (alarmLevel) {
            case "rot":
                return checkCustomers(numberOfCustomers, 0);
            case "gelb":
                return checkCustomers(numberOfCustomers, 30);
            case "grün":
                return checkCustomers(numberOfCustomers, 60);
            default:
                return "unknown alarm level";
        }
    }

    private static String checkCustomers(int numberOfCustomers, int maxNumberOfCustomers) {
        if (numberOfCustomers > maxNumberOfCustomers) {
            return WARNING_MESSAGE;
        }
        return OK_MESSAGE;
    }

}
