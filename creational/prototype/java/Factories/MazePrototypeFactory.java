package Factories;

import Products.Door;
import Products.Maze;
import Products.Room;
import Products.Wall;

public class MazePrototypeFactory {
    private final Maze mazePrototype;
    private final Wall wallPrototype;
    private final Room roomPrototype;
    private final Door doorPrototype;

    public MazePrototypeFactory(Maze maze, Wall wall, Room room, Door door) {
        mazePrototype = maze;
        wallPrototype = wall;
        roomPrototype = room;
        doorPrototype = door;
    }

    public Maze makeMaze() {
        return mazePrototype.clonePrototype();
    }

    public Wall makeWall() {
        return wallPrototype.clonePrototype();
    }

    public Room makeRoom(int number) {
        Room room = roomPrototype.clonePrototype();
        room.setNumber(number);
        return room;
    }

    public Door makeDoor(Room source, Room destination) {
        Door door = doorPrototype.clonePrototype();
        door.initialize(source, destination);
        return door;
    }
}
