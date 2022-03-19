package org.example;

public class BadEncapsulation {
    public double solarInput_kWh;

    @Override
    public String toString() {
        return "BadEncapsulation{" +
                "solarInput_kWh=" + solarInput_kWh +
                '}';
    }
}
