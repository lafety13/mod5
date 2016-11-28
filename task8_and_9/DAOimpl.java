package task8_and_9;

import task2.Room;

public class DAOimpl implements DAO {
    private static Room[] roomDb = new Room[10];
    private static int len = 0;

    public DAOimpl() {

    }

    @Override
    public Room save(Room room) {
        roomDb[len] = room;
        len++;
        return roomDb[len-1];
    }
    // the first found room will be deleted
    @Override
    public boolean delete(Room room) {
        int i;
        for (i = 0; i< len; i++) {
            if (room.equals(roomDb[i])) {
                break;
            }
        }
        if (i == len) {
            return false;
        } else {
            //
            System.arraycopy(roomDb, i + 1, roomDb, i, len - i);
            len--;
            return true;
        }

    }

    @Override
    public Room update(Room room) {
        int i;
        for (i = 0; i< len; i++) {
            if (room.equals(roomDb[i])) {
                break;
            }
        }
        return roomDb[i];
    }

    @Override
    public Room findById(long id) {
        return roomDb[(int) id];
    }

    @Override
    public Room[] getAll() {
        return roomDb;
    }
}
