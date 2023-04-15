package MazeGame;

import Products.*;

public class MazeGame {
    public Maze createMaze() {
        Maze maze = makeMaze();
        Room room1 = makeRoom(1);
        Room room2 = makeRoom(2);
        Door door = makeDoor(room1, room2);

        room1.setSide(Direction.North, makeWall());
        room1.setSide(Direction.South, makeWall());
        room1.setSide(Direction.East, door);
        room1.setSide(Direction.West, makeWall());

        room2.setSide(Direction.North, makeWall());
        room2.setSide(Direction.South, makeWall());
        room2.setSide(Direction.East, makeWall());
        room2.setSide(Direction.West, door);

        maze.addRoom(room1);
        maze.addRoom(room1);

        return maze;
    }

    protected Maze makeMaze() {
        return new Maze();
    }

    protected Room makeRoom(int number) {
        return new Room(number);
    }

    protected Door makeDoor(Room source, Room destination) {
        return new Door(source, destination);
    }

    protected Wall makeWall() {
        return new Wall();
    }
}
