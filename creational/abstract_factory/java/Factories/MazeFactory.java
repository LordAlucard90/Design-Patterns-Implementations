package Factories;

import Products.Door;
import Products.Maze;
import Products.Room;
import Products.Wall;

public class MazeFactory {
    public Maze makeMaze() {
        return new Maze();
    }

    public Wall makeWall() {
        return new Wall();
    }

    public Room makeRoom(int number) {
        return new Room(number);
    }

    public Door makeDoor(Room source, Room destination) {
        return new Door(source, destination);
    }
}
