package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CinemaSeatTest {

    @Test
    public void testCinemaSeat() {
        // Given
        CinemaSeat seat = new CinemaSeat(5, 3);

        // When
        int seatNumber = seat.getNumber();
        int seatRow = seat.getRow();

        // Then
        assertEquals(5, seatNumber);
        assertEquals(3, seatRow);
    }
}