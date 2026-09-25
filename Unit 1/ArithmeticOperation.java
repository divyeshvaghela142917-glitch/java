public class ArithmeticOperation {
    public static void main(String[] args) {
        // Check if two numbers are passed
        if (args.length != 2) {
            System.out.println("Usage: java ArithmeticOperation <num1> <num2>");
            return;
        }

        // Convert command line arguments to integers
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        // Perform arithmetic operations
        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("Modulus = " + (a % b));
    }
}
