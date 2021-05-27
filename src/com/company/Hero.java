package com.company;
public class Hero{
    private int experience = 0, damage, health, speed, gold = 500, num = 0;
    private String type;
    private String []abilities = {"Extra health", "Gold earnier", "Extra Damage","Extra Defence"};
    private String []inventory = new String[64];
    private String ability;
    private boolean defence;


    public Hero(String type) {
        this.type = type;
        switch(type){
            case "Titan":
                damage = 100;
                health = 500;
                speed = 10;
                defence = false;
                ability = abilities[0];
                break;
            case "Goblin":
                damage = 50;
                health = 450;
                speed = 60;
                defence = true;
                ability = abilities[1];
                break;
            case "Archer":
                damage = 85;
                health = 220;
                speed = 30;
                defence = true;
                ability = abilities[2];
                break;
            case "Assassin":
                damage = 70;
                health = 350;
                speed = 70;
                defence = true;
                ability = abilities[3];
                break;
        }
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getAbilities() {
        return abilities;
    }

    public void setAbilities(String[] abilities) {
        this.abilities = abilities;
    }

    public String[] getInventory() {
        return inventory;
    }

    public void setInventory(String[] inventory) {
        this.inventory = inventory;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public boolean isDefence() {
        return defence;
    }

    public void setDefence(boolean defence) {
        this.defence = defence;
    }

    public void Buy(String NewItem, int price){
        if (price > this.gold){
            System.out.println("You have no way to buy this item" + "\nYou have: " + this.gold + " gold"
                               + "\nYou need: " + price + " of gold to buy this item");
        }else{
            if(num >= 64) {
                System.out.println("You haven't enough cells for placement");
                return;
            }
            this.gold = this.gold - price;
            inventory[num] = NewItem;
            num++;
        }
    }









}
