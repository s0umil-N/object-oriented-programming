import java.util.Scanner;
public class static_2 {
    static int n;
    public static void main (String[]args){
    Scanner s = new Scanner (System.in);
    System.out.print("enter a number");
    n = s.nextInt();  
    System.out.println(+n);
    s.close();
    }
}
