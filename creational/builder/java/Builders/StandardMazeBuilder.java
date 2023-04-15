package Builders;

import Products.*;

public class StandardMazeBuilder implements MazeBuilder {
    private Maze maze = null;

    @Override
    public void buildMaze() {
        this.maze = new Maze();
    }

    @Override
    public void buildRoom(int number) {
        if (this.maze.getRoom(number) == null) {
            Room room = new Room(number);
            room.setSide(Direction.North, new Wall());
            room.setSide(Direction.South, new Wall());
            room.setSide(Direction.East, new Wall());
            room.setSide(Direction.West, new Wall());
            this.maze.addRoom(room);
        }
    }

    @Override
    public void buildDoor(int sourceRoom, int destinationRoom) {
        Room source = this.maze.getRoom(sourceRoom);
        Room destination = this.maze.getRoom(destinationRoom);

        Door door = new Door(source, destination);

        source.setSide(this.commonWall(source, destination), door);
        source.setSide(this.commonWall(destination, source), door);
    }

    @Override
    public Maze getMaze() {
        return maze;
    }

    private Direction commonWall(Room source, Room destination) {
        if (source.getNumber() < destination.getNumber()) {
            return Direction.North;
        } else {
            return Direction.South;
        }
    }
}
