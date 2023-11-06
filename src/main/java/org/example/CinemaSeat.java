package org.example;

public class CinemaSeat {
    private final int number;
    private final int row;
    private boolean occupied;

    public CinemaSeat(int number, int row) {
        this.number = number;
        this.row = row;
        this.occupied = false;  // Set as default
    }

    public int getNumber() {
        return number;
    }

    public int getRow() {
        return row;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void occupySeat() {
        if (!occupied) {
            occupied = true;
        }
    }

    public void freeUpSeat() {
        if (occupied) {
            occupied = false;
        }
    }

}