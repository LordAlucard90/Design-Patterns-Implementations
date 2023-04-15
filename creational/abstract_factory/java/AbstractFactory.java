import Factories.*;
import Products.*;

public class AbstractFactory {
    public static void main(String[] args) {
        // create maze
        MazeFactory mazeFactory = new MazeFactory();
        Maze maze = AbstractFactory.createMaze(mazeFactory);
        assert maze.getRoom(1) != null;

        // create bombed maze
        MazeFactory bombedMazeFactory = new BombedMazeFactory();
        Maze bombedMaze = AbstractFactory.createMaze(bombedMazeFactory);
        assert bombedMaze.getRoom(1) != null;
        assert bombedMaze.getRoom(1) instanceof RoomWithBomb;

        // create enchanted maze
        MazeFactory enchantedMazeFactory = new EnchantedMazeFactory();
        Maze enchantedMaze = AbstractFactory.createMaze(enchantedMazeFactory);
        assert enchantedMaze.getRoom(1) != null;
        assert enchantedMaze.getRoom(1) instanceof EnchantedRoom;
    }

    private static Maze createMaze(MazeFactory factory) {
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
