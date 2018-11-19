import Factories.*;
import Products.Direction;
import Products.Door;
import Products.Maze;
import Products.Room;

public class MazeGame {
    public static void main(String[] args) {
        // create maze
        MazeFactory mazeFactory = new MazeFactory();
        Maze maze = MazeGame.createMaze(mazeFactory);

        // create enchanted maze
        MazeFactory enchantedMazeFactory = new EnchantedMazeFactory();
        Maze enchantedMaze = MazeGame.createMaze(enchantedMazeFactory);

        // create bombed maze
        MazeFactory bombedMazeFactory = new BombedMazeFactory();
        Maze bombedMaze = MazeGame.createMaze(bombedMazeFactory);
    }

    private static Maze createMaze(MazeFactory factory){
        Maze maze = factory.makeMaze();
        Room room1 = factory.makeRoom(1);
        Room room2 = factory.makeRoom(2);
        Door door = factory.makeDoor(room1, room2);

        room1.setSide(Direction.North, factory.makeWall());
        room1.setSide(Direction.South, factory.makeWall());
        room1.setSide(Direction.East, door);
        room1.setSide(Direction.West, factory.makeWall());

        room2.setSide(Direction.North, factory.makeWall());
        room2.setSide(Direction.South, factory.makeWall());
        room2.setSide(Direction.East, factory.makeWall());
        room2.setSide(Direction.West, door);

        maze.addRoom(room1);
        maze.addRoom(room1);

        return maze;
    }
}
