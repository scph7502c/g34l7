package org.example;

public class Triangle {
    public static boolean isRectangularTriangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }
        return (a * a + b * b == c * c);
    }
}
