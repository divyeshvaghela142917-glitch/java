import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get number from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Use if condition
        if (num > 0) {
            System.out.println("The number is Positive.");
        }

        sc.close();
    }
}
