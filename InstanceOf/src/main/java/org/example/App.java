package org.example;

public class App 
{
    public static void main( String[] args )
    {
        // using instanceOf with basic data types does not seem ideal, but I do some type casting
        // see below for a good use case for instanceOf
        // starting with an int - verifying with instanceOf
        Integer num = new Integer(5);

        if (num instanceof Integer) {
            System.out.println("num is an integer");
        } else {
            System.out.println("num is not an integer");
        }

        // casting the int to a string and running the same if statement
        String intToString = String.valueOf(num);

        if (intToString instanceof String) {
            System.out.println("num is now a string");
        } else {
            System.out.println("num is not a string");
        }

        System.out.println("***********************");

        // InstanceOf
        Bible bible = new Bible();
        Bible isaiah = new Isaiah();

        if (isaiah instanceof Bible) {
            System.out.println(isaiah instanceof Bible);
            System.out.println("Isaiah is an instance of Bible");
        }
        if (bible instanceof Isaiah) {
            System.out.println(bible instanceof Isaiah);
            System.out.println("Bible is an instance of Isaiah");
        } else {
            System.out.println(bible instanceof Isaiah);
            System.out.println("Bible is not an instance of Isaiah");
        }
    }
}
