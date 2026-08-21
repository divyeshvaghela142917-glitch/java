// Program to demonstrate Abstract Class in Java

abstract class Animal {

    // Abstract method
    abstract void sound();

    // Normal method
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {

    // Implementing abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}

public class AbstractExample {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
        d.eat();
    }
}