import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() { return name; }
    public int getCapacity() { return capacity; }

    @Override
    public String toString() {
        return String.format("Bogie: %-12s | Capacity: %d seats", name, capacity);
    }
}

public class Train {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<Bogie> passengerBogies = new ArrayList<>();

        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 24));

        System.out.println("Initial List:");
        passengerBogies.forEach(System.out::println);

        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        System.out.println("\nSorted Bogies (By Capacity - Ascending):");
        for (Bogie b : passengerBogies) {
            System.out.println(b);
        }

        System.out.println("-------------------------------");
        System.out.println("Program continues...");
    }
}