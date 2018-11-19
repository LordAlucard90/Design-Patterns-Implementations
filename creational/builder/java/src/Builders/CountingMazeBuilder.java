package Builders;

import Products.Maze;

import java.util.HashMap;
import java.util.Map;

public class CountingMazeBuilder implements MazeBuilder{
    private int rooms = 0;
    private int doors = 0;

    @Override
    public void buildMaze() {}

    @Override
    public void buildRoom(int room) {
        this.rooms++;
    }

    @Override
    public void buildDoor(int sourceRoom, int destinationRooom) {
        this.doors++;
    }

    @Override
    public Maze getMaze() {
        return null;
    }

    public Map<String, Integer> getCounts(){
        Map<String, Integer> counts = new HashMap<String, Integer>();
        counts.put("Rooms", this.rooms);
        counts.put("Doors", this.doors);
        return counts;
    }
}
