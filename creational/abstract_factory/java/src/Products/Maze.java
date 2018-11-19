package Products;

import java.util.HashMap;
import java.util.Map;

public class Maze {
    private Map<Integer, Room> rooms = new HashMap<Integer, Room>();

    public void addRoom(Room room){
        rooms.put(room.getNumber(), room);
    }
}
