package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) throws IOException {

        File file = new File("C:\\Users\\ell27\\Desktop\\Java Training Program\\ell27-Java-Apprentice\\reverseSort10000lines\\src\\main\\java\\org\\original.txt");
        Scanner scan = new Scanner(file);

        String fileData = "";
        while(scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] splitLine = line.split(" ", -2);
            line.replaceAll("^[a-zA-Z0-9]+$","");
            Arrays.sort(splitLine, String.CASE_INSENSITIVE_ORDER);
            // remove from array and reverse order of the line contents
            for (int i = splitLine.length - 1; i >= 0; i--) {
                fileData = fileData.concat(splitLine[i] + " ");
            }
            fileData = fileData.concat("\n");
        }
        System.out.println(fileData);
        scan.close();

        FileWriter newFile = new FileWriter("C:\\Users\\ell27\\Desktop\\Java Training Program\\ell27-Java-Apprentice\\reverseSort10000lines\\src\\main\\java\\org\\newFile.txt");
        newFile.write(fileData);
        newFile.close();
    }
}