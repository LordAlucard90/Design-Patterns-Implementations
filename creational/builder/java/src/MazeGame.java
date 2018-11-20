import Builders.*;
import Products.Maze;

import java.util.Map;

public class MazeGame {
    public static void main(String[] args) {
        // create simple standard maze
        Maze standard = MazeGame.createSimpleMaze(new StandardMazeBuilder());
        assert standard.getRoom(1) != null;

        // count long maze
        CountingMazeBuilder countingMazeBuilder = new CountingMazeBuilder();
        Maze countingMaze = MazeGame.createLongMaze(countingMazeBuilder);
        assert countingMaze.getRoom(1) == null;
        assert countingMazeBuilder.getCounts().equals(Map.ofEntries(Map.entry("Doors", 999),
                                                                    Map.entry("Rooms", 1000)));
    }

    private static Maze createSimpleMaze(MazeBuilder builder){
        builder.buildMaze();

        builder.buildRoom(1);
        builder.buildRoom(2);
        builder.buildDoor(1,2);

        return builder.getMaze();
    }

    private static Maze createLongMaze(MazeBuilder builder){
        builder.buildMaze();

        builder.buildRoom(1);
        for (int r = 2; r < 1001; r++) {
            builder.buildRoom(r);
            builder.buildDoor(r - 1, r);
        }

        return builder.getMaze();
    }
}
