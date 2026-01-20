import java.util.Scanner;

public class Soumil {
    public static void main(String[] args) {
        // Using try-with-resources to automatically close the scanner
        try (Scanner s = new Scanner(System.in)) {
            
            System.out.print("How many arrays do you want to create? ");
            int numArrays = s.nextInt();
            
            System.out.print("How many elements should each array hold? ");
            int size = s.nextInt();

            // Declaring a 2D array: arr[number of arrays][size of each]
            int[][] allArrays = new int[numArrays][size];
            int totalSum = 0;

            // Input: Nested loops to fill the 2D array
            for (int i = 0; i < numArrays; i++) {
                System.out.println("\n--- Entering data for Array " + (i + 1) + " ---");
                for (int j = 0; j < size; j++) {
                    System.out.print("Enter element " + (j + 1) + ": ");
                    allArrays[i][j] = s.nextInt();
                    totalSum += allArrays[i][j]; // Add to total sum immediately
                }
            }

            System.out.println("\n------------------------------");
            System.out.println("The total sum of all " + numArrays + " arrays is: " + totalSum);
            System.out.println("------------------------------");
        }
    }
}