package Builders;

import Products.*;

import java.util.HashMap;
import java.util.Map;

public class CountingMazeBuilder implements MazeBuilder {
    private Maze maze = null;
    private int rooms = 0;
    private int doors = 0;

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
            this.rooms++;
        }
    }

    @Override
    public void buildDoor(int sourceRoom, int destinationRoom) {
        Room source = this.maze.getRoom(sourceRoom);
        Room destination = this.maze.getRoom(destinationRoom);

        Door door = new Door(source, destination);

        source.setSide(this.commonWall(source, destination), door);
        source.setSide(this.commonWall(destination, source), door);
        this.doors++;
    }

    @Override
    public Maze getMaze() {
        return maze;
    }

    public Map<String, Integer> getCounts() {
        Map<String, Integer> counts = new HashMap<String, Integer>();
        counts.put("Rooms", this.rooms);
        counts.put("Doors", this.doors);
        return counts;
    }

    private Direction commonWall(Room source, Room destination) {
        if (source.getNumber() < destination.getNumber()) {
            return Direction.North;
        } else {
            return Direction.South;
        }
    }
}
