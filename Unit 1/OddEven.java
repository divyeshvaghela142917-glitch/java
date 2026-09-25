public class OddEven {
    public static void main(String[] args) {

        // Check if a number is provided
        if (args.length != 1) {
            System.out.println("Usage: java OddEven <number>");
            return;
        }

        // Convert command line argument to integer
        int num = Integer.parseInt(args[0]);

        // Check Odd or Even
        if (num % 2 == 0) {
            System.out.println(num + " is an Even number.");
        } else {
            System.out.println(num + " is an Odd number.");
        }
    }
}
