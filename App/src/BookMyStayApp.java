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

        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("Single", 2);

        Set<String> used = new HashSet<>();

        Reservation r = new Reservation("Abhi", "Single");

        if (inventory.get("Single") > 0) {
            String roomId = "Single-" + (used.size() + 1);
            used.add(roomId);
            inventory.put("Single", inventory.get("Single") - 1);

            System.out.println("Allocated: " + roomId);
        }
    }
}