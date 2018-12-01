import MazeGame.*;
import Products.EnchantedRoom;
import Products.Maze;
import Products.RoomWithBomb;

public class Main {
    public static void main(String[] args) {
        // create standard maze
        Maze standardMaze = new MazeGame().createMaze();
        assert standardMaze.getRoom(1) != null;

        // create bombed maze
        Maze bombedMaze = new BombedMazeGame().createMaze();
        assert bombedMaze.getRoom(1) instanceof RoomWithBomb;

        // create enchanted maze
        Maze enchantedMaze = new EnchantedMazeGame().createMaze();
        assert enchantedMaze.getRoom(1) instanceof EnchantedRoom;
    }
}
