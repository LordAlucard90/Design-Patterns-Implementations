package directors;

import Builders.MazeBuilder;

public class SimpleMazeDirector implements MazeDirector {
    private final MazeBuilder builder;

    public SimpleMazeDirector(MazeBuilder builder) {
        this.builder = builder;
    }

    @Override
    public void construct() {
        builder.buildMaze();

        builder.buildRoom(1);
        builder.buildRoom(2);
        builder.buildDoor(1, 2);
    }
}
