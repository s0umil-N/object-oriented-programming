import java.util.Scanner;
class static_1 {
    int n;
    public static void main (String[]args){
        Scanner s = new Scanner (System.in);
        static_1 m = new static_1();
        System.out.print("enter a number: ");
        m.n = s.nextInt();
        System.out.println(+m.n);
        s.close();
    }
}

