import java.util.LinkedHashSet;
import java.util.Set;

public class TrainApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        Set<String> trainFormation = new LinkedHashSet<>();

        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        System.out.println("Initial Formation: " + trainFormation);

        System.out.println("Attempting to attach duplicate: Sleeper...");
        trainFormation.add("Sleeper");

        System.out.println("Final Formation (Unique & Ordered): " + trainFormation);
        System.out.println("Total Bogies: " + trainFormation.size());
    }
}