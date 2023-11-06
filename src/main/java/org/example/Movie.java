package org.example;

public class Movie {
    private final String title;
    private final String director;
    private final int durationInMinutes;
    private final int productionYear;

    public Movie(String title, String director, int durationInMinutes, int productionYear) {
        this.title = title;
        this.director = director;
        this.durationInMinutes = durationInMinutes;
        this.productionYear = productionYear;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public int getProductionYear() {
        return productionYear;
    }

}
