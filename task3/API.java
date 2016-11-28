package task3;

import task2.Room;
import task5.DAOimpl;

import java.util.Date;

public abstract class API {
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room roomForSearch = new Room(-1, price, persons, new Date(), hotel, city);
        Room[] room = new Room[getAllRooms().length];
        DAOimpl db = new DAOimpl();
        int foundInd = 0;

        for (Room room1 : getAllRooms()) {
            if (room1.equals(roomForSearch)) {
                room[foundInd] = room1;
                foundInd++;
            }
        }
        return room;
    }

    public abstract Room[] getAllRooms();
}

