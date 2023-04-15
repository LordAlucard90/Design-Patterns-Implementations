import Factories.*;
import Products.*;

public class Prototype {
    public static void main(String[] args) {
        // create maze
        MazePrototypeFactory standardMazeFactory = new MazePrototypeFactory(
                new Maze(),
                new Wall(),
                new Room(),
                new Door()
        );
        Maze maze = Prototype.createMaze(standardMazeFactory);
        assert maze.getRoom(1) != null;

        // create bombed maze
        MazePrototypeFactory bombedMazeFactory = new MazePrototypeFactory(
                new Maze(),
                new BombedWall(),
                new RoomWithBomb(),
                new Door()
        );
        Maze bombedMaze = Prototype.createMaze(bombedMazeFactory);
        assert bombedMaze.getRoom(1) instanceof RoomWithBomb;

        // create enchanted maze
        MazePrototypeFactory enchantedMazeFactory = new MazePrototypeFactory(
                new Maze(),
                new Wall(),
                new EnchantedRoom(new Spell()),
                new DoorNeedingSpell()
        );
        Maze enchantedMaze = Prototype.createMaze(enchantedMazeFactory);
        assert enchantedMaze.getRoom(1) instanceof EnchantedRoom;
    }

    private static Maze createMaze(MazePrototypeFactory factory) {
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
