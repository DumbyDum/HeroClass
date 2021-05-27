package com.company;

import java.util.Random;

public class Main {
    private static Hero slave = new Hero("Titan"),
                        master = new Hero("Assassin");
    private static Random rand = new Random();
    public static void main(String[] args) {

        while(slave.getHealth() > 0 && master.getHealth() > 0){
            int q = rand.nextInt(4);
            //slave
            switch(q){
                case 0:
                    slave.setHealth(slave.getHealth() - master.getDamage());
                    if(!master.isDefence()){
                        master.setHealth(master.getHealth() - (int)(slave.getDamage() * 0.5));
                    }
                    break;
                case 1:
                    slave.Buy("ak-47", 300);
                    break;
                case 2:
                    slave.setExperience(slave.getExperience() + 20);
                    break;
                case 3:
                    slave.setDefence(!slave.isDefence());
                    break;
            }
            //master
            rand.setSeed(rand.nextLong());
            q = rand.nextInt(4);
            switch(q){
                case 0:
                    master.setHealth(master.getHealth() - slave.getDamage());
                    if(!slave.isDefence()){
                        slave.setHealth(slave.getHealth() - (int)(master.getDamage() * 0.5));
                    }
                    break;
                case 1:
                    master.Buy("ak-74m", 350);
                    break;
                case 2:
                    master.setExperience(master.getExperience() + 20);
                    break;
                case 3:
                    master.setDefence(!master.isDefence());
                    break;
            }
            rand.setSeed(rand.nextLong());
            if(slave.getHealth() <=0){
                System.out.println("Slave was killed");
            }
            if(master.getHealth() <=0){
                System.out.println("Master was killed");
            }
        }
    }
}
