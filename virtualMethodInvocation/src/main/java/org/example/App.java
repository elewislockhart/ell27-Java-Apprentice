package org.example;

import java.net.StandardSocketOptions;

public class App
{
    /*
    All methods in Java are virtual by default. So if a child class overrides the method
    then that is the method that will get called, even if you reference the instance using
    a base class type.
     */
    public static void main( String[] args )
    {
        LaserAttachment la = new LaserAttachment();
        la.laserSetup();
        System.out.println(la.toString());
        la.fireLaser();

        LaserAttachment la1 = new LaserAttachmentUpgrade1();
        la1.laserSetup();
        System.out.println(la1.toString());
        la1.fireLaser();

        LaserAttachment la2 = new LaserAttachmentUpgrade2();
        la2.laserSetup();
        System.out.println(la2.toString());
        la2.fireLaser();
    }
}
