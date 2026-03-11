abstract class Room {
    protected String roomType;
    protected int price;
    protected int availableRooms;

    public Room(String roomType, int price, int availableRooms) {
        this.roomType = roomType;
        this.price = price;
        this.availableRooms = availableRooms;
    }

    public void displayDetails() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Price per Night: ₹" + price);
        System.out.println("Available Rooms: " + availableRooms);
        System.out.println("");
    }
}
class SingleRoom extends Room {

    public SingleRoom(int availableRooms) {
        super("Single Room", 2000, availableRooms);
    }
}
class DoubleRoom extends Room {

    public DoubleRoom(int availableRooms) {
        super("Double Room", 3500, availableRooms);
    }
}
class SuiteRoom extends Room {

    public SuiteRoom(int availableRooms) {
        super("Suite Room", 5000, availableRooms);
    }
}
public class BookMyStayApp {

    public static void main(String[] args) {
        Room single = new SingleRoom(10);
        Room doubleRoom = new DoubleRoom(6);
        Room suite = new SuiteRoom(3);
        System.out.println("Welcome to BookMyStay\n");
        single.displayDetails();
        doubleRoom.displayDetails();
        suite.displayDetails();
    }
}