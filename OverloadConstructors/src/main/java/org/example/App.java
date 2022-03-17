package org.example;

public class App
{
    public static void main( String[] args )
    {
        Robot r1 = new Robot();
        Robot r2 = new Robot("Clean up","Vacuum");
        Robot r3 = new Robot("Demolition", "Jack Hammer", "Tracks", 8, 14);

        System.out.println("----------");
        System.out.println(r1.toString());
        System.out.println("----------");
        System.out.println(r2.toString());
        System.out.println("----------");
        System.out.println(r3.toString());
    }
}
