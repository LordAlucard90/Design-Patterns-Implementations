package Products;

public class RoomWithBomb extends Room {
    public RoomWithBomb() {
    }

    protected RoomWithBomb(RoomWithBomb roomWithBomb) {
        super(roomWithBomb);
    }

    @Override
    public Room clonePrototype() {
        return new RoomWithBomb(this);
    }
}
