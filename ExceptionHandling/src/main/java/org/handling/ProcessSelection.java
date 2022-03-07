package org.handling;

import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Array;

public class ProcessSelection {
    int selection;
    public void ProcessSelection(int sel) {
        this.selection = sel;
    }

    public static void process(int sel) {
        System.out.println("Number Selected: " + sel);

        switch (sel) {
            case 1:
                checked();
                break;
            case 2:
                unchecked();
                break;
            case 3:
                badReturn();
                break;
            case 4:
                System.exit(0);
        }
    }

    public static void checked() {
        System.out.println("... Generating FileNotFound Exception ...");
        try {
            File file = new File("/home/wrongPath/file.txt");
            FileReader fileReader = new FileReader(file);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void unchecked() {
        System.out.println("... Generating ArrayIndexOutOfBounds Exception ...");
        int[] array = new int[5];
        try {
            int noIndex = array[10];
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private int num = 0;
    public static void badReturn() {
        System.out.println("Uncomment line 54 (// num++) in the ProcessSelection class, then restart the program to see the error.");
        // num++;
    }
}
