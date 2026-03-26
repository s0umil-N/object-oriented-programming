import java.util.*;

public class sorted_set {
    public static void main(String[] args) {

        // INSERTION
        SortedSet<Integer> set = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 5 numbers: ");
        for (int i = 0; i<5; i++){
            set.add(sc.nextInt());
        }
        // TRAVERSAL
        System.out.println("Traversal (Sorted):");
        for(Integer num : set)
            System.out.println(num);

        // SEARCHING
        System.out.println("\nSearching 30:");
        System.out.println(set.contains(30));

        // UPDATION
        set.remove(20);
        set.add(25);

        System.out.println("\nAfter Updation:");
        System.out.println(set);

        // DELETION
        set.remove(10);

        System.out.println("\nAfter Deletion:");
        System.out.println(set);
        sc.close();
    }
}

