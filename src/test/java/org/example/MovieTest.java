package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieTest {

    @Test
    public void testMovie() {
        // Given
        Movie avatar = new Movie("Avatar", "James Cameron", 162, 2009);

        // When
        String title = avatar.getTitle();
        String director = avatar.getDirector();
        int duration = avatar.getDurationInMinutes();
        int productionYear = avatar.getProductionYear();

        // Then
        assertEquals("Avatar", title);
        assertEquals("James Cameron", director);
        assertEquals(162, duration);
        assertEquals(2009, productionYear);

    }
}
