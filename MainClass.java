class Parent {
    void show() {
        System.out.println("Parent class function");
    }
}

class Child extends Parent {
    void display() {
        super.show();   
    }
}

public class MainClass {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}
