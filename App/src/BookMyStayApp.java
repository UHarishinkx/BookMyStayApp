import java.util.*;

public class BookMyStayApp {

    public static void main(String[] args) {

        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("Single", 0);

        System.out.println("Cancelling booking...");

        inventory.put("Single", inventory.get("Single") + 1);

        System.out.println("Updated availability: " + inventory.get("Single"));
    }
}