import Builders.*;
import Products.Maze;
import directors.LongMazeDirector;
import directors.SimpleMazeDirector;

import java.util.Map;

public class Builder {
    public static void main(String[] args) {
        // create mazes with simple maze director
        StandardMazeBuilder standardMazeBuilderA = new StandardMazeBuilder();
        SimpleMazeDirector simpleStandardMazeDirector = new SimpleMazeDirector(standardMazeBuilderA);
        simpleStandardMazeDirector.construct();
        Maze simpleStandardMazeA = standardMazeBuilderA.getMaze();
        assert simpleStandardMazeA.getRoom(1) != null;

        CountingMazeBuilder countingMazeBuilderA = new CountingMazeBuilder();
        SimpleMazeDirector simpleCountingMazeDirector = new SimpleMazeDirector(countingMazeBuilderA);
        simpleCountingMazeDirector.construct();
        Maze simpleCountingMazeA = countingMazeBuilderA.getMaze();
        assert simpleCountingMazeA.getRoom(1) != null;
        assert countingMazeBuilderA.getCounts().equals(Map.ofEntries(Map.entry("Doors", 1),
                Map.entry("Rooms", 2)));

        // create mazes with long maze director
        StandardMazeBuilder standardMazeBuilderB = new StandardMazeBuilder();
        LongMazeDirector longStandardMazeDirector = new LongMazeDirector(standardMazeBuilderB);
        longStandardMazeDirector.construct();
        Maze longStandardMazeA = standardMazeBuilderB.getMaze();
        assert longStandardMazeA.getRoom(1) != null;

        CountingMazeBuilder countingMazeBuilderB = new CountingMazeBuilder();
        LongMazeDirector longCountingMazeDirector = new LongMazeDirector(countingMazeBuilderB);
        longCountingMazeDirector.construct();
        Maze longCountingMazeA = countingMazeBuilderB.getMaze();
        assert longCountingMazeA.getRoom(1) != null;
        assert countingMazeBuilderB.getCounts().equals(Map.ofEntries(Map.entry("Doors", 999),
                Map.entry("Rooms", 1000)));
    }
}
