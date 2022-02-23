package com.ell27_stringbuilder;

public final class App {
    /*
        This program is created to see how many chars can be stored
        in a stringBuilder class before the program crashes.
    */
    public static void main(String[] args) {

        StringBuilder string = new StringBuilder();
        long limit = 1_000_000_000;

        for (int i = 0; i < limit; i++) {
            string.append("a");
            System.out.println(string.length());
        }
    }
}
