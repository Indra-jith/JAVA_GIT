import java.util.*;
import java.time.*;
import java.time.format.*;
import java.time.temporal.*;

public class date_time_dev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date1 = LocalDate.parse(str1, formatter);
        LocalDate date2 = LocalDate.parse(str2, formatter);
        if (!date1.isAfter(date2)) {
            long days = ChronoUnit.DAYS.between(date1, date2);
            System.out.println(days);
        }
    }
}
