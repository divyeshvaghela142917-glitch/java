
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class DateFormatExample {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        DateTimeFormatter format1 =
            DateTimeFormatter.ofPattern("dd-MM-yyyy");

        DateTimeFormatter format2 =
            DateTimeFormatter.ofPattern("dd/MM/yyyy");

        DateTimeFormatter format3 =
            DateTimeFormatter.ofPattern("dd MMMM yyyy");

        DateTimeFormatter format4 =
            DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");

        System.out.println("Date in different formats:");
        System.out.println("Format 1: " + date.format(format1));
        System.out.println("Format 2: " + date.format(format2));
        System.out.println("Format 3: " + date.format(format3));
        System.out.println("Format 4: " + date.format(format4));
    }
}

