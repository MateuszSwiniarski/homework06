package com.rodzyn.homework06.model;

public class Movie {

    private String name;
    private int year;
    private String productionType;

    public Movie() {
    }

    public Movie(String name, int year, String productionType) {
        this.name = name;
        this.year = year;
        this.productionType = productionType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getProductionType() {
        return productionType;
    }

    public void setProductionType(String productionType) {
        this.productionType = productionType;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", productionType='" + productionType + '\'' +
                '}';
    }
}
