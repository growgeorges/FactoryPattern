package Implementation;

import API.ESEngine;
import API.ESWeapon;

public abstract class EnemyShip {
    private String name;
    ESWeapon weapon;
    ESEngine engine;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    abstract void makeShip();

    public String toString(){

        return "The " + name + " has a topspeed of " + engine + " and an attack power of " + weapon;
    }

    public void displayEnemyShip(){
        System.out.println(this.getName() + " has appeared on the screen.");
    }

    public void followHeroShip(){
        System.out.println(this.getName() + " is following the Hero Ship");
    }

    public void enemyShipShoots(){
        System.out.println(this.getName() + " is shooting and does " + weapon);
    }
}
