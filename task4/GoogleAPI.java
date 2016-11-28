package task4;

import task2.Room;
import task3.API;
import java.util.Date;

public class GoogleAPI extends API {
    private Room[] rooms = new Room[5];

    public GoogleAPI() {
        rooms[0] = new Room(1, 1000, 1, new Date(), "BBC", "Kiev");
        rooms[1] = new Room(2, 2000, 3, new Date(), "IBM", "Kiev");
        rooms[2] = new Room(3, 3000, 5, new Date(), "BBC", "Kiev");
        rooms[3] = new Room(4, 1000, 1, new Date(), "BBC", "Kiev");
        rooms[4] = new Room(5, 5000, 3, new Date(), "ITC", "Kiev");
    }

    @Override
    public Room[] getAllRooms() {
        return rooms;
    }
}
