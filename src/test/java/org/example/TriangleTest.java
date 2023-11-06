package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
    @Test
    public void testIsRectangularTriangleTrue() {
        // Given
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;

        // When
        boolean isRectangular = Triangle.isRectangularTriangle(a, b, c);

        // Then
        assertEquals(true, isRectangular);
    }

    @Test
    public void testIsRectangularTriangleFalse() {
        // Given
        double a = 3.0;
        double b = 4.0;
        double c = 6.0;

        // When
        boolean isRectangular = Triangle.isRectangularTriangle(a, b, c);

        // Then
        assertEquals(false, isRectangular);
    }
}
