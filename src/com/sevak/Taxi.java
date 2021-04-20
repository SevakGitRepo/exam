package com.sevak;

public class Taxi {
    private String model;
    private String country;
    private int year; //1903-2020
    private int mile; //0-999_999
    private boolean isSport;
    private int weight; //1000-3000 KG
    private int topSpeed; //0-220 max km/h
    private int seats; //>0
    private double cost ; //> 0 445.6$


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMile() {
        return mile;
    }

    public void setMile(int mile) {
        this.mile = mile;
    }

    public boolean isSport() {
        return isSport;
    }

    public void setSport(boolean sport) {
        isSport = sport;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "model='" + model + '\'' +
                ", country='" + country + '\'' +
                ", year=" + year +
                ", mile=" + mile +
                ", isSport=" + isSport +
                ", weight=" + weight+"KG" +
                ", topSpeed=" + topSpeed +"km/h" +
                ", seats=" + seats +
                ", cost=" + cost +
                '}';
    }
}
