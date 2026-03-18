import java.util.*;

class RoomInventory {
    private Map<String, Integer> inventory = new HashMap<>();

    public void addRoomType(String type, int count) {
        inventory.put(type, count);
    }

    public int getAvailability(String type) {
        return inventory.getOrDefault(type, 0);
    }
}

class Room {
    String type;
    int price;

    Room(String type, int price) {
        this.type = type;
        this.price = price;
    }
}

public class BookMyStayApp {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();
        inventory.addRoomType("Single", 5);
        inventory.addRoomType("Double", 3);
        inventory.addRoomType("Suite", 2);

        Room single = new Room("Single", 1500);
        Room dbl = new Room("Double", 2500);
        Room suite = new Room("Suite", 5000);

        System.out.println("Available Rooms:\n");

        if (inventory.getAvailability("Single") > 0)
            System.out.println("Single - ₹" + single.price);

        if (inventory.getAvailability("Double") > 0)
            System.out.println("Double - ₹" + dbl.price);

        if (inventory.getAvailability("Suite") > 0)
            System.out.println("Suite - ₹" + suite.price);
    }
}