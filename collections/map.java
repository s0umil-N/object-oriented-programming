import java.util.*;

public class map {
    public static void main(String[] args) {

        // INSERTION
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Aman");
        map.put(2, "Riya");
        map.put(3, "Karan");

        // TRAVERSAL
        System.out.println("Traversal:");
        for(Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // SEARCHING
        System.out.println("\nSearching key 2:");
        System.out.println(map.containsKey(2));

        // UPDATION
        map.put(2, "Priya");   // replaces value

        System.out.println("\nAfter Updation:");
        System.out.println(map);

        // DELETION
        map.remove(1);

        System.out.println("\nAfter Deletion:");
        System.out.println(map);
    }
}
