package Factories;

import Products.BombedWall;
import Products.Room;
import Products.RoomWithBomb;
import Products.Wall;

public class BombedMazeFactory extends MazeFactory {
    @Override
    public Wall makeWall() {
        return new BombedWall();
    }

    @Override
    public Room makeRoom(int number) {
        return new RoomWithBomb(number);
    }
}
