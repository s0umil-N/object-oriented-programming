import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Hello Koder");

        String name;
        
        String[] arr = new String[5];

        System.out.println("Enter your name:");
      
        name = s.nextLine();

        System.out.println("Enter 5 words for the array:");
        for (int i = 0; i < 5; i++) {
            arr[i] = s.next();
        }

        System.out.println("--- Results ---");
        System.out.println("The value of name is: " + name);
        
       
        if (args.length > 0) {
            System.out.println("The first command line argument is: " + args[0]);
        } else {
            System.out.println("No command line arguments were provided.");
        }

        s.close();
    }
}