package org.handling;

import java.util.Scanner;

public class Menu {
    public static int menu() {

        int selection;

        Scanner input = new Scanner(System.in);
        /************************************************/
        System.out.println("Select Error to Generate ");
        System.out.println("-------------------------\n");
        System.out.println("1 - Checked Exception (File not found)");
        System.out.println("2 - Unchecked Exception (Index out of bounds)");
        System.out.println("3 - Error (Static/non-static Context)");
        System.out.println("4 - Quit");

        selection = input.nextInt();
        return selection;
    }
}