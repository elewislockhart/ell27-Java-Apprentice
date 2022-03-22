package org.example;

public class Locations {

    private String locationName;
    private double x;
    private double y;

    public Locations(String locationName, double x, double y) {
        this.locationName = locationName;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Locations{" +
                "locationName='" + locationName + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
