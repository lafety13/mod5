package task7;

import task2.Room;
import task4.*;
import task8_and_9.*;
import task6.Controller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Поиск номеров с разными апи
        System.out.println("Найденные номера Controller1");
        Controller controller1 = new Controller(new TripAdvisorAPI(), new BookingComAPI());
        Room[][] rooms = controller1.requstRooms(1000, 1, "Kiev", "BBC");
        display(rooms);

        System.out.println("Найденные номера Controller2");
        Controller controller2 = new Controller(new TripAdvisorAPI(), new BookingComAPI(), new GoogleAPI());
        Room[][] rooms1 = controller2.requstRooms(1000, 1, "Kiev", "BBC");
        display(rooms1);

        System.out.println("Найденные номера Controller3");
        Controller controller3 = new Controller(new TripAdvisorAPI());
        Room[][] rooms2 = controller3.requstRooms(1000, 1, "Kiev", "BBC");
        display(rooms2);

        // Проверка на совпадения номеров
        System.out.println("Одинаковые номера");
        Room[][] match = new Room[20][];
        match[0] = controller1.check(new TripAdvisorAPI(), new BookingComAPI());
        display(match);

        System.out.println("Одинаковые номера");
        Room[][] match1 = new Room[20][];
        match1[0] = controller1.check(new TripAdvisorAPI(), new BookingComAPI());
        display(match1);

        System.out.println("Одинаковые номера");
        Room[][] match2 = new Room[20][];
        match2[0] = controller1.check(new TripAdvisorAPI(), new BookingComAPI());
        display(match2);


    }

    private static void display(Room[][] rooms) {
        for (Room[] arrayRoom : rooms) {
            if (arrayRoom != null) {
                for (Room room : arrayRoom) {
                    if (room != null) {
                        System.out.println(room);
                    }
                }
            }
        }
        System.out.println();
    }
}
