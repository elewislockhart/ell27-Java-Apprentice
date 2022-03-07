package org.handling;

public class App 
{
    public static void main( String[] args )
    {
        Menu menu = new Menu();
        int selection = menu.menu();

        ProcessSelection ps = new ProcessSelection();
        ps.process(selection);
    }
}
