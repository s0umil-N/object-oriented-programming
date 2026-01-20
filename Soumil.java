import java.util.Scanner;

public class Soumil {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("How many arrays? ");
        int n = s.nextInt(); // Number of arrays
        
        System.out.print("How many numbers in each? ");
        int size = s.nextInt(); // Size of each array

        int totalSum = 0;

        // Loop for each array
        for (int i = 1; i <= n; i++) {
            System.out.println("Entering numbers for Array #" + i);
            
            // Loop for the numbers inside the current array
            for (int j = 1; j <= size; j++) {
                int input = s.nextInt();
                totalSum = totalSum + input; 
            }
        }

        System.out.println("Total Sum: " + totalSum);
        s.close();
    }
}