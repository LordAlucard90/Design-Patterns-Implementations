import Builders.*;
import Products.Maze;

public class MazeGame {
    public static void main(String[] args) {
        // create simple standard maze
        Maze standard = MazeGame.createSimpleMaze(new StandardMazeBuilder());

        // count long maze
        CountingMazeBuilder countingMazeBuilder = new CountingMazeBuilder();
        MazeGame.createLongMaze(countingMazeBuilder);

        System.out.println("The long Maze has:");
        System.out.println(countingMazeBuilder.getCounts());
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
