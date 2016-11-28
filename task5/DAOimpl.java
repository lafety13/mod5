package task5;

import task2.Room;
import java.util.HashMap;
import java.util.Map;

public class DAOimpl implements DAO {
    private  Map<String, Room> dataBase = new HashMap<>();

    @Override
    public Room save(Room room) {
        System.out.println("Object: " + room.toString() +
                ". Method: save");
        return null;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("Object: " + room.toString() +
                ". Method: delete");
        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println("Object: " + room.toString() +
                ". Method: update");
        return null;
    }

    @Override
    public Room findById(long id) {
        System.out.println("Object: " + this.getClass().getSimpleName() +
                ". Method: findById");
        return null;
    }

    @Override
    public Room getAll() {
        System.out.println("Object: " + this.getClass().getSimpleName() +
                ". Method: getAll");
        return null;
    }
}
