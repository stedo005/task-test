package de.neuefische.alarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlarmTest {

    @Test
    void shouldWarnBecauseTooManyPeopleAreInTheStore() {
        assertEquals("Zu viele Personen", Alarm.check(31));
    }

    @Test
    void shouldNotWarnBecauseThereAre30PeopleInTheStore() {
        assertEquals("Maximale Personenanzahl nicht überschritten", Alarm.check(30));
    }

    @Test
    void shouldNotWarnBecauseThereAreLessThan30PeopleInTheStore() {
        assertEquals("Maximale Personenanzahl nicht überschritten", Alarm.check(15));
    }

}