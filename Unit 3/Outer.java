
class Outer {

    // Nested Interface
    interface Inner {
        void display();
    }
}

// Implementing the nested interface
class Demo implements Outer.Inner {

    public void display() {
        System.out.println("This is a Nested Interface.");
    }

    public static void main(String[] args) {

        Demo obj = new Demo();

        obj.display();
    }
}
