class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class overrides the sound() method
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main class
public class MethodOverriding {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}