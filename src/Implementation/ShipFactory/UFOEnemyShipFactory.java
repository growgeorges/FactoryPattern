package Implementation.ShipFactory;

import API.ESEngine;
import API.ESWeapon;
import API.EnemyShipFactory;
import Implementation.MesEngines.ESUFOEngine;
import Implementation.MesGuns.ESUFOGun;

public class UFOEnemyShipFactory implements EnemyShipFactory {

    @Override
    public ESWeapon addESGun() {
        return new ESUFOGun();
    }

    @Override
    public ESEngine addESEngine() {
        return new ESUFOEngine();
    }
}
