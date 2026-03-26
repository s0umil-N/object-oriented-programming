import java.util.*;
public class sorted_map {
    public static void main(String[] args) {

        // INSERTION
        SortedMap<Integer, String> map = new TreeMap<>();
        map.put(103, "Delhi");
        map.put(101, "Mumbai");
        map.put(102, "Chennai");

        // TRAVERSAL
        System.out.println("Traversal (Sorted by Keys):");
        for(Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // SEARCHING
        System.out.println("\nSearching key 102:");
        System.out.println(map.containsKey(102));

        // UPDATION
        map.put(102, "Bangalore");

        System.out.println("\nAfter Updation:");
        System.out.println(map);

        // DELETION
        map.remove(101);

        System.out.println("\nAfter Deletion:");
        System.out.println(map);
    }
}
