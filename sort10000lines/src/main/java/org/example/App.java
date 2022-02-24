package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) throws IOException {

        File file = new File("C:\\Users\\ell27\\Desktop\\Java Training Program\\ell27-Java-Apprentice\\sort10000lines\\src\\main\\java\\original.txt");
        Scanner scan = new Scanner(file);

        String fileData = "";
        while(scan.hasNextLine()) {
            String line = scan.nextLine();
            String[] splitLine = line.split(" ", -2);
            line.replaceAll("^[a-zA-Z0-9]+$","");
            Arrays.sort(splitLine, String.CASE_INSENSITIVE_ORDER);
            fileData = fileData.concat(Arrays.toString(splitLine) + "\n");
        }
        scan.close();

        FileWriter newFile = new FileWriter("C:\\Users\\ell27\\Desktop\\Java Training Program\\ell27-Java-Apprentice\\sort10000lines\\src\\main\\java\\newFile.txt");
        newFile.write(fileData);
        newFile.close();
    }
}
