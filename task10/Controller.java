package task10;

import task2.Room;
import task3.API;
import task4.*;
import task8_and_9.DAO;
import task8_and_9.DAOimpl;


import java.util.Date;

public class Controller {
    private API[] apis;
    private DAO dao = new DAOimpl();

    public Controller() {
        apis = new API[3];
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }

    public Controller(API...ap) {
        apis = new API[ap.length];
        apis = ap;
    }

    public Room[][] requstRooms(int price, int persons, String city, String hotel) {
        Room[][] room = new Room[10][10];

        for (int i = 0; i < apis.length; i++) {
            room[i] = apis[i].findRooms(price, persons, city, hotel);
        }
        return room;
    }

    public Room[] check(API api1, API api2) {
        Room[] allRoomsApi1 = api1.getAllRooms();
        Room[] allRoomsApi2 = api2.getAllRooms();
        Room[] match = new Room[21];
        int len = allRoomsApi1.length;

        for (int i = 0; i < len; i++) {
            if (allRoomsApi1[i].equals(allRoomsApi2[i])) {
                match[i] = allRoomsApi1[i];
            }
        }
        return match;
    }

    public Room save(Room room) {
        return dao.save(room);
    }

    public boolean delete(Room room) {
        return dao.delete(room);
    }

    public Room update(Room room) {
        return dao.update(room);
    }

    public Room findById(long id) {
        return dao.findById(id);
    }

    public Room[] getAll() {
        return dao.getAll();
    }

}
