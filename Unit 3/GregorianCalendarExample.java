
import java.util.GregorianCalendar;

class GregorianCalendarExample {
    public static void main(String[] args) {

        GregorianCalendar cal = new GregorianCalendar();

        System.out.println("Gregorian Calendar Information:");

        System.out.println("Year: " +
                cal.get(GregorianCalendar.YEAR));

        System.out.println("Month: " +
                (cal.get(GregorianCalendar.MONTH) + 1));

        System.out.println("Day: " +
                cal.get(GregorianCalendar.DAY_OF_MONTH));

        System.out.println("Day of Week: " +
                cal.get(GregorianCalendar.DAY_OF_WEEK));

        System.out.println("Day of Year: " +
                cal.get(GregorianCalendar.DAY_OF_YEAR));

        System.out.println("Week of Year: " +
                cal.get(GregorianCalendar.WEEK_OF_YEAR));

        System.out.println("Is Leap Year: " +
                cal.isLeapYear(cal.get(GregorianCalendar.YEAR)));
    }
}

