package Main;

import Implementation.EnemyShip;
import Implementation.EnemyShipBuilding;
import Implementation.UFOEnemyShipBuilding;

public class Main {

    public static void main(String args[]){
        System.out.println("l'aventure commence ici !");

        EnemyShipBuilding ESbuilding = new UFOEnemyShipBuilding();

        EnemyShip ESship1 = ESbuilding.orderTheShip("BOSS");
        EnemyShip ESship2 = ESbuilding.orderTheShip("UFO");


    }
}
