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

        Queue<Reservation> queue = new LinkedList<>();
        queue.add(new Reservation("Abhi", "Single"));

        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("Single", 1);

        while (!queue.isEmpty()) {
            Reservation r = queue.poll();

            if (inventory.get(r.room) > 0) {
                inventory.put(r.room, inventory.get(r.room) - 1);
                System.out.println("Booking confirmed for " + r.guest);
            }
        }
    }
}