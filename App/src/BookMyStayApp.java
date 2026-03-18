import java.util.*;

class Reservation {
    String guest;
    String room;

    Reservation(String g, String r) {
        guest = g;
        room = r;
    }
}

public class BookMyStayApp {

    public static void main(String[] args) {

        Queue<Reservation> queue = new LinkedList<>();

        queue.add(new Reservation("Abhi", "Single"));
        queue.add(new Reservation("Subha", "Double"));

        while (!queue.isEmpty()) {
            Reservation r = queue.poll();
            System.out.println(r.guest + " requested " + r.room);
        }
    }
}