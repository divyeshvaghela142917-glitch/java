// Program to demonstrate Interface in Java

interface Animal {
    void sound();   // abstract method
}

class Dog implements Animal {

    // Implementing interface method
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();
    }
}