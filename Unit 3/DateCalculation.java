
import java.util.Calendar;

class DateCalculation {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        System.out.println("Current Date and Time:");
        System.out.println(cal.getTime());

        // Add 10 days
        cal.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println("\nAfter adding 10 days:");
        System.out.println(cal.getTime());

        // Subtract 5 days
        cal.add(Calendar.DAY_OF_MONTH, -5);
        System.out.println("\nAfter subtracting 5 days:");
        System.out.println(cal.getTime());

        // Add 2 months
        cal.add(Calendar.MONTH, 2);
        System.out.println("\nAfter adding 2 months:");
        System.out.println(cal.getTime());

        // Subtract 1 month
        cal.add(Calendar.MONTH, -1);
        System.out.println("\nAfter subtracting 1 month:");
        System.out.println(cal.getTime());
    }
}

