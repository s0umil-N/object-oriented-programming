import java.util.Scanner;

class arraysum {
    static int size;
    static int[] numbers;
    static int totalSum = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        size = s.nextInt();
        numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = s.nextInt();
            totalSum += numbers[i];
        }

        System.out.println("The sum of the array is: " + totalSum);
        s.close();
    }
}