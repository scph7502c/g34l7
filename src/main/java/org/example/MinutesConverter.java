package org.example;

public class MinutesConverter {
    public static int minutesToSeconds(int minutes) {
        if (minutes < 0) {
            return -1; //
        }
        return minutes * 60;
    }
}

