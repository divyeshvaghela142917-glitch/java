public class MultipleCatchExample {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;

            int result = a / b;
            System.out.println("Result = " + result);

            int arr[] = {10, 20, 30};
            System.out.println(arr[5]);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Cannot divide by zero.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Exception: Index is out of range.");
        }
        catch (Exception e) {
            System.out.println("Some other exception occurred.");
        }

        System.out.println("Program continues normally.");
    }
}