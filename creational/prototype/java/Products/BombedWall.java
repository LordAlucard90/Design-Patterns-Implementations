package Products;

public class BombedWall extends Wall {
    public BombedWall() {
    }

    protected BombedWall(BombedWall bombedWall) {
        super(bombedWall);
    }

    @Override
    public Wall clonePrototype() {
        return new BombedWall(this);
    }
}
