package task10;

import task2.Room;
import task4.BookingComAPI;
import task8_and_9.DAO;
import task8_and_9.DAOimpl;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Controller d = new Controller();
        d.save(new Room(1, 1000, 1, new Date(), "BBC", "Kiev"));
        d.save(new Room(2, 1000, 1, new Date(), "BBC", "Kiev"));
        d.save(new Room(3, 2000, 1, new Date(), "BBC", "Kiev"));
        d.save(new Room(5, 4000, 1, new Date(), "BBC", "Kiev"));

        d.delete(new Room(1, 1000, 1, new Date(), "BBC", "Kiev"));

        d.update(new Room(1, 1000, 1, new Date(), "BBC", "Kiev")).setPrice(123);

        System.out.println(d.findById(0));
        System.out.println();

        Room[] rq;
        rq = d.getAll();

        for (Room room : rq) {
            System.out.println(room);
        }
    }
}
