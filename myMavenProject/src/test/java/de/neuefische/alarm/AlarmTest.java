package de.neuefische.alarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlarmTest {

    @Test
    void testThatNumberOfPeopleIsNotYetReached_yellow() {
        assertEquals("Maximale Personenzahl nicht überschritten", Alarm.checkNumberOfCustomers(15, "gelb"));
    }

    @Test
    void testThatNumberOfPeopleIsIsExactlyReached_yellow() {
        assertEquals("Maximale Personenzahl nicht überschritten", Alarm.checkNumberOfCustomers(30, "gelb"));
    }

    @Test
    void testThatNumberOfPeopleIsIsTooHigh_yellow() {
        assertEquals("Zu viele Personen", Alarm.checkNumberOfCustomers(31, "gelb"));
    }

    @Test
    void testThatNumberOfPeopleIsNotYetReached_green() {
        assertEquals("Maximale Personenzahl nicht überschritten", Alarm.checkNumberOfCustomers(45, "grün"));
    }

    @Test
    void testThatNumberOfPeopleIsIsExactlyReached_green() {
        assertEquals("Maximale Personenzahl nicht überschritten", Alarm.checkNumberOfCustomers(60, "grün"));
    }

    @Test
    void testThatNumberOfPeopleIsIsTooHigh_green() {
        assertEquals("Zu viele Personen", Alarm.checkNumberOfCustomers(61, "grün"));
    }

    @Test
    void testThatNoOneIsAllowedWhenAlarmLevelIsRed() {
        assertEquals("Zu viele Personen", Alarm.checkNumberOfCustomers(1, "rot"));
        assertEquals("Maximale Personenzahl nicht überschritten", Alarm.checkNumberOfCustomers(0, "rot"));
    }

    @Test
    void testUnknownAlarmLevel() {
        assertEquals("unknown alarm level", Alarm.checkNumberOfCustomers(100, "unknown"));
    }

}