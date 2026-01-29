import java.util.Scanner;

class DynamicArray {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = s.nextInt();

        int[] arr = new int[n];
        int[] frequency = new int[n];

  

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            frequency[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            if (frequency[i] == -1)
                continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    frequency[j] = -1;
                }
            }
            frequency[i] = count;
        }

        System.out.println("Element | Frequency");
        for (int i = 0; i < n; i++) {
            if (frequency[i] != -1) {
                System.out.println(arr[i] + "      | " + frequency[i]);
            }
        }
        s.close();
    }
}
