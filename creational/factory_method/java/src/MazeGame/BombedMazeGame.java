package MazeGame;

import Products.BombedWall;
import Products.Room;
import Products.RoomWithBomb;
import Products.Wall;

public class BombedMazeGame extends MazeGame {
    @Override
    protected Wall makeWall() {
        return new BombedWall();
    }

    @Override
    protected Room makeRoom(int number) {
        return new RoomWithBomb(number);
    }
}
