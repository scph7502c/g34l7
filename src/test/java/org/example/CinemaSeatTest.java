package org.example;

import org.junit.jupiter.api.Test;

public class CinemaSeatTest {

    @Test
    public void testCinemaSeat() {
        CinemaSeat cinemaSeat = new CinemaSeat(1, 2);
        System.out.println(cinemaSeat.getNumber());
        System.out.println(cinemaSeat.getRow());
        System.out.println(cinemaSeat.isOccupied());
        cinemaSeat.occupy();
        System.out.println(cinemaSeat.isOccupied());
        cinemaSeat.freeUp();
        System.out.println(cinemaSeat.isOccupied());
    }
}