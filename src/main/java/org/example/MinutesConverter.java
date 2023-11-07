package org.example;

public class MinutesConverter {
    public static int minutesToSeconds(int minutes) {
        if (minutes < 0) {
            return 0; //
        }
        return minutes * 60;
    }
}