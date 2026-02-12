class Subject{
    int sum(int a, int b){
        return a+b;
    }
}

class BMW extends Subject {

    int sum(int a, int b){
        return a+b;
    }
    int display(){
        int a = super.sum(4,5);
        return a;
    }
}
public class polymorphism {
    public static void main(String[] args) {
   // Subject c = new Subject();
    BMW b = new BMW();
    System.out.println(b.sum(3, 4));
    System.out.print(b.display());
    }
}
