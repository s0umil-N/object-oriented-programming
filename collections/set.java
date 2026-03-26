import java.util.*;

public class set{
    public static void main(String[] args) {

        // INSERTION
        Set<String> set = new TreeSet<>();
          Scanner sc = new Scanner(System.in);
        System.out.print("enter characters: ");
        for (int i = 0; i<5; i++){
            set.add(sc.nextLine());
        }

        // TRAVERSAL
        System.out.println("Traversal:");
        for(String item : set) {
            System.out.println(item);
        }

        // SEARCHING
        System.out.println("\nSearching Mango:");
        if(set.contains("Mango"))
            System.out.println("Found");

        // UPDATION (remove + add)
        set.remove("Banana");
        set.add("Grapes");

        System.out.println("\nAfter Updation:");
        System.out.println(set);

        // DELETION
        set.remove("Apple");

        System.out.println("\nAfter Deletion:");
        System.out.println(set);
        sc.close();
    }
}