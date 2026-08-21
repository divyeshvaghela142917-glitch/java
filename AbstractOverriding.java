// Program to demonstrate Method Overriding using Abstract Class

abstract class Animal {

    // Abstract method
    abstract void sound();
}

class Dog extends Animal {

    // Overriding abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    // Overriding abstract method
    void sound() {
        System.out.println("Cat meows");
    }
}

public class AbstractOverriding {
    public static void main(String[] args) {

        Dog d = new Dog();
        Cat c = new Cat();

        d.sound();
        c.sound();
    }
}