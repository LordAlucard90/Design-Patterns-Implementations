package Products;

public class Wall implements MapSite {
    public Wall() {}

    protected Wall(Wall wall) {}

    @Override
    public void enter() {
        System.out.println("You shall not pass!");
    }

    @Override
    public Wall clonePrototype() {
        return new Wall(this);
    }
}
