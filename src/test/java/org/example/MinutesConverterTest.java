package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinutesConverterTest {

    @Test
    public void testMinutesToSecondsGivenPositiveMinutesWhenThen() {
        // Given
        int minutes = 5;

        // When
        int seconds = MinutesConverter.minutesToSeconds(minutes);

        // Then
        assertEquals(300, seconds);
    }

    @Test
    public void testMinutesConverter() {
        // Given
        int minutes = 1;

        // When
        int seconds = MinutesConverter.minutesToSeconds(minutes);

        // Then
        assertEquals(60, seconds);
    }

    @Test
    public void testMinutesConverterIfNegative() {
        // Given
        int minutes = -10;

        // When
        int seconds = MinutesConverter.minutesToSeconds(minutes);

        // Then
        assertEquals(0, seconds);
    }
}