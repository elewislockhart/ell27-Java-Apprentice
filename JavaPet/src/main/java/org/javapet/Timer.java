package org.javapet;

import javafx.application.Platform;

import java.util.TimerTask;

class Game extends TimerTask {

    Pet pet = new Pet("Orsen", 20, 20, "Happy", 20, "Alive");
    StatusColor sc = new StatusColor();

    public void run() {

        if (pet.getEnergy() == 0) {
            pet.setStatus("Has Died");
            pet.setMood("Peaceful");
            String test = OutputColor.RED + "Your pet " + pet.getName() + " has died... :( ...you monster!";
            System.out.println(test);
            System.exit(0);
        }

        //String hh = String.format("%s %s", sc.getColor((int) pet.getHappiness()), pet.getHappiness());

        System.out.println();
        System.out.println("--------------------------- ------------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s",
                "Name", "Happiness", "Energy", "Mood", "Health", "Status");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s",
                pet.getName(), pet.getHappiness(), pet.getEnergy(), pet.getMood(), pet.getHealth(), pet.getStatus());
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------");
    }
}

