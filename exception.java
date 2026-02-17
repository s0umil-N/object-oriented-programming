import java.util.Scanner;
public class exception {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
         System.out.print("enter a name: ");
            String name = s.nextLine();
            System.out.print("enter age: ");
            int age = s.nextInt();
            System.out.print("enter salary: ");
            float salary = s.nextFloat();
            try {
                if (age < 5)
                    throw new ArithmeticException("age should be greater than 5");
                else if (salary < 80000)
                    throw new ArithmeticException("salary should be greater than 80000");
                if (name.length() < 20)
                    throw new ArithmeticException("name should be more than 20 characters");
                System.out.println("data inserted successfully");
            }
           catch (ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
           }
           s.close();
    }
   
}
