import java.util.HashMap;
class RoomInventory {
    private HashMap<String, Integer> inventory;
    public RoomInventory() {
        inventory = new HashMap<>();
    }
    public void addRoomType(String roomType, int count) {
        inventory.put(roomType, count);
    }
    public int getAvailability(String roomType) {
        return inventory.getOrDefault(roomType, 0);
    }
    public void bookRoom(String roomType) {
        int available = inventory.getOrDefault(roomType, 0);

        if (available > 0) {
            inventory.put(roomType, available - 1);
            System.out.println(roomType + " booked successfully.");
        }
        else {
            System.out.println("No " + roomType + " rooms available.");
        }
    }
    public void displayInventory() {
        System.out.println("\nCurrent Room Availability:");
        for (String room : inventory.keySet()) {
            System.out.println(room + " : " + inventory.get(room));
        }
    }
}
public class BookMyStayApp {
    public static void main(String[] args) {
        System.out.println("Welcome to BookMyStay");
        RoomInventory inventory = new RoomInventory();
        inventory.addRoomType("Single Room", 10);
        inventory.addRoomType("Double Room", 6);
        inventory.addRoomType("Suite Room", 3);
        inventory.displayInventory();
        System.out.println("\nBooking Rooms...");
        inventory.bookRoom("Single Room");
        inventory.bookRoom("Suite Room");
        inventory.bookRoom("Suite Room");
        inventory.bookRoom("Suite Room");
        inventory.bookRoom("Suite Room");
        inventory.displayInventory();
    }
}