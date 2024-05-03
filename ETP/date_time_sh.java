import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class date_time_sh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date1 = LocalDate.parse(str1, format);
        String str2 = scanner.nextLine();
        LocalDate date2 = LocalDate.parse(str2, format);
        int count = 0;
        while (!date1.isAfter(date2)) {
            if (date1.getDayOfWeek() == DayOfWeek.SUNDAY) {
                count++;
            }
            date1 = date1.plusDays(1);
        }
        System.out.println(count);

    }
}
