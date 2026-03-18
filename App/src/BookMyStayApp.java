import java.util.*;

class Service {
    String name;
    double cost;

    Service(String n, double c) {
        name = n;
        cost = c;
    }
}

public class BookMyStayApp {

    public static void main(String[] args) {

        List<Service> services = new ArrayList<>();

        services.add(new Service("Breakfast", 500));
        services.add(new Service("Spa", 1000));

        double total = 0;

        for (Service s : services) {
            total += s.cost;
        }

        System.out.println("Total Add-on: " + total);
    }
}