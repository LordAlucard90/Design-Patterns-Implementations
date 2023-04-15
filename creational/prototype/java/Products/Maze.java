package Products;

import java.util.HashMap;
import java.util.Map;

public class Maze {
    private Map<Integer, Room> rooms = new HashMap<Integer, Room>();

    public Maze() {
    }

    protected Maze(Maze maze) {
        this.rooms = maze.rooms;
    }

    public void addRoom(Room room) {
        rooms.put(room.getNumber(), room);
    }

    public Room getRoom(int number) {
        if (rooms.containsKey(number)) {
            return rooms.get(number);
        }
        return null;
    }

    public Maze clonePrototype() {
        return new Maze(this);
    }
}
