
class LocalInner {

    void display() {

        int num = 50;

        // Local Inner Class
        class Inner {

            void show() {
                System.out.println("Value of num: " + num);
            }
        }

        // Create object of Local Inner Class
        Inner obj = new Inner();

        // Call method
        obj.show();
    }

    public static void main(String[] args) {

        LocalInner outer = new LocalInner();

        outer.display();
    }
}


