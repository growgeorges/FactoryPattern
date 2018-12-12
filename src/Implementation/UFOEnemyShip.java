package Implementation;

import API.EnemyShipFactory;

public class UFOEnemyShip extends EnemyShip {
    EnemyShipFactory shipFactory;

    public UFOEnemyShip(EnemyShipFactory shipFactory){
        this.shipFactory = shipFactory;
    }

    @Override
    void makeShip() {
        System.out.println("Making EnemyShip " + this.getName());

        weapon = shipFactory.addESGun();
        engine = shipFactory.addESEngine();
    }
}
