package Builders;

import Products.Maze;

public interface MazeBuilder {
    void buildMaze();
    void buildRoom(int room);
    void buildDoor(int sourceRoom, int destinationRooom);
    Maze getMaze();
}
