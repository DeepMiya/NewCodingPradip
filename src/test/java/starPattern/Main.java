package starPattern;

class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void display() {
        System.out.println("Child x: " + x); // Child's variable
        System.out.println("Parent x: " + super.x); // Parent's variable
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}