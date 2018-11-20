package MazeGame;

import Products.*;

public class EnchantedMazeGame extends MazeGame {
    @Override
    protected Room makeRoom(int number) {
        return new EnchantedRoom(number, this.castSpell());
    }

    @Override
    protected Door makeDoor(Room source, Room destination) {
        return new DoorNeedingSpell(source, destination);
    }

    protected Spell castSpell(){
        return new Spell();
    }
}
