package org.javapet;

import java.util.Timer;
import java.util.TimerTask;

public class App {
    public static void main( String[] args )
    {
        Timer timer = new Timer();
        TimerTask task = new Game();
        timer.schedule(task, 200, 1000);

        System.gc();
    }
}
