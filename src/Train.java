import java.util.LinkedList;

public class TrainApp {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        LinkedList<String> consist = new LinkedList<>();

        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC");
        consist.add("Cargo");
        consist.add("Guard");

        System.out.println("Initial Consist: " + consist);

        consist.add(2, "Pantry Car");
        System.out.println("After inserting Pantry Car: " + consist);

        consist.removeFirst();
        consist.removeLast();

        System.out.println("Final Ordered Train Consist: " + consist);
        System.out.println("Final Bogie Count: " + consist.size());
    }
}