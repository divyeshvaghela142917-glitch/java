// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

// Child class 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

// Child class 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing.");
    }
}

// Main class
public class hierarchicalinheritance {
    public static void main(String[] args) {

        Dog d = new Dog();
        Cat c = new Cat();

        System.out.println("Dog Details:");
        d.eat();
        d.bark();

        System.out.println();

        System.out.println("Cat Details:");
        c.eat();
        c.meow();
    }
}