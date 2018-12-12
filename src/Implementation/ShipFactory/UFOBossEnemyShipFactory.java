package Implementation.ShipFactory;

import API.ESEngine;
import API.ESWeapon;
import API.EnemyShipFactory;
import Implementation.MesEngines.ESUFOBossEngine;
import Implementation.MesGuns.ESUFOBossGun;

public class UFOBossEnemyShipFactory implements EnemyShipFactory {

    @Override
    public ESWeapon addESGun() {
        return new ESUFOBossGun();
    }

    @Override
    public ESEngine addESEngine() {
        return new ESUFOBossEngine();
    }
}
