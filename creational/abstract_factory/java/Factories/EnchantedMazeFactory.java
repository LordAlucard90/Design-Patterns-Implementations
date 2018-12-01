package Factories;

import Products.*;

public class EnchantedMazeFactory extends MazeFactory {
    @Override
    public Room makeRoom(int number) {
        return new EnchantedRoom(number, this.castSpell());
    }

    @Override
    public Door makeDoor(Room source, Room destination) {
        return new DoorNeedingSpell(source, destination);
    }

    protected Spell castSpell(){
        return new Spell();
    }
}
