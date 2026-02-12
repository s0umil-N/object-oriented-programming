class Calculator {

    // Method 1
    int add(int a, int b) {
        return a + b;
    }

    // Method 2 
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3 
    double add(double a, double b) {
        return a + b;
    }
}

public class Overloading {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println(c.add(5, 3)); 
        System.out.println(c.add(5, 3, 2));    
        System.out.println(c.add(2.5, 3.5));    
    }
}
