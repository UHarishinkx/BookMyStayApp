import java.util.*;

class Reservation {
    String guest, room;

    Reservation(String g, String r) {
        guest = g;
        room = r;
    }
}

public class BookMyStayApp {

    public static void main(String[] args) {

        List<Reservation> history = new ArrayList<>();

        history.add(new Reservation("Abhi", "Single"));
        history.add(new Reservation("Subha", "Double"));

        for (Reservation r : history) {
            System.out.println(r.guest + " booked " + r.room);
        }
    }
}