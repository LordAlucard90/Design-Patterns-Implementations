package Products;

import java.util.HashMap;
import java.util.Map;

public class Room implements MapSite {
    private int number;
    private Map<Direction, MapSite> sides = new HashMap<Direction, MapSite>();

    public Room() {
    }

    protected Room(Room room) {
        this.number = room.number;
        this.sides = room.sides;
    }

    @Override
    public void enter() {
        System.out.println("Welcome in Room " + number);
    }

    public void setSide(Direction direction, MapSite site) {
        this.sides.put(direction, site);
    }

    public MapSite getSide(Direction direction, MapSite site) {
        return sides.get(direction);
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public Room clonePrototype() {
        return new Room(this);
    }
}
