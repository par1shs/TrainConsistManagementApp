import java.util.HashSet;
import java.util.Set;

public class TrainApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("B1");
        bogieIds.add("B2");
        bogieIds.add("B3");

        System.out.println("Adding duplicate bogie ID: B2...");
        bogieIds.add("B2");

        System.out.println("Unique Bogie IDs in System: " + bogieIds);
        System.out.println("Total Unique Bogies: " + bogieIds.size());
    }
}