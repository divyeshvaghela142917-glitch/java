// Program to extend one interface into another interface

interface Animal {
    void eat();
}

interface Dog extends Animal {
    void bark();
}

class Test implements Dog {

    public void eat() {
        System.out.println("Dog eats food");
    }

    public void bark() {
        System.out.println("Dog barks");
    }
}

public class InterfaceExtend {
    public static void main(String[] args) {

        Test t = new Test();

        t.eat();
        t.bark();
    }
}