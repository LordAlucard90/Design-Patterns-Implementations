package directors;

import Builders.MazeBuilder;

public class LongMazeDirector implements MazeDirector {
    private final MazeBuilder builder;

    public LongMazeDirector(MazeBuilder builder) {
        this.builder = builder;
    }

    @Override
    public void construct() {
        builder.buildMaze();

        builder.buildRoom(1);
        for (int r = 2; r < 1001; r++) {
            builder.buildRoom(r);
            builder.buildDoor(r - 1, r);
        }
    }
}
