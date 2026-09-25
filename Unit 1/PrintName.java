import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get name from user
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Print name 10 times using loop
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ". " + name);
        }

        sc.close();
    }
}
