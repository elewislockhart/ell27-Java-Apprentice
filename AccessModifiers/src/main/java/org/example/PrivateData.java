package org.example;

import java.lang.reflect.Array;

public class PrivateData {
    private double robotLocation[] = new double[2];

    public PrivateData(double x, double y) {
        Array.set(this.robotLocation, 0, x);
        Array.set(this.robotLocation, 1, y);
    }

    public double[] getRobotLocation() {
        return robotLocation;
    }

    public void setRobotLocationX(double x) {
        Array.set(this.robotLocation, 0, x);
    }

    public void setRobotLocationY(double y) {
        Array.set(this.robotLocation, 1, y);
    }
}
