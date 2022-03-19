package org.example;

public class App 
{
    public static void main( String[] args )
    {
        /*
        Bad Encapsulation:
            In this example, the encapsulation is bad because the solarPower input variable is public and can be
            accessed without any value verification. It fails to user getters and setters. The user is allowed to
            directly set the input to a negative number because there is no code to verify the input.
         */
        BadEncapsulation be = new BadEncapsulation();
        be.solarInput_kWh = -20;

        /*
        Good Encapsulation:
            In this example, encapsulation is good because the solarPanel input is private and can only be accessed via
            a getter and setter. The setter method ensures the value is not less than 0 since a solar panel can never
            generate a negative amount of power input.
         */
        GoodEncapsulation ge = new GoodEncapsulation();
        System.out.println(ge.getSolarInput_kWh());
        ge.setSolarInput_kWh(-20);
    }
}
