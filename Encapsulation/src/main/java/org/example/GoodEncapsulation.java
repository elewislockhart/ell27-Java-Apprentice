package org.example;

public class GoodEncapsulation {
    private double solarInput_kWh = 0;

    @Override
    public String toString() {
        return "BadEncapsulation{" +
                "solarInput_kWh=" + solarInput_kWh +
                '}';
    }

    public double getSolarInput_kWh() {
        return solarInput_kWh;
    }

    public void setSolarInput_kWh(double solarInput_kWh) {
        if (solarInput_kWh < 0) {
            System.out.println("The solarInput_kWh cannot be set to a negative number.");
        }
        else {
            this.solarInput_kWh = solarInput_kWh;
        }
    }
}
