package Implementation;

import API.EnemyShipFactory;

public class UFOBossEnemyShip extends EnemyShip {
    EnemyShipFactory shipFactory;

    public UFOBossEnemyShip(EnemyShipFactory shipFactory){
        this.shipFactory = shipFactory;
    }

    @Override
    void makeShip() {
        System.out.println("Making EnemyShip " + this.getName());

        weapon = shipFactory.addESGun();
        engine = shipFactory.addESEngine();
    }
}
