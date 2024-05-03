import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.time.Year;
import java.time.DayOfWeek;

public class date_time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        // DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH/mm/ss");
        // LocalDate date1 = LocalDate.now();
        // String datestr = date1.format(formatter1);
        // System.out.println(datestr);
        // LocalTime time1 = LocalTime.now();
        // String timestr = time1.format(formatter2);
        // System.out.println(timestr);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E dd-MM-yyyy");
        String yr1 = scanner.nextLine();
        StringBuilder sb1 = new StringBuilder(yr1);
        sb1.insert(0, "Fri, 01-01-");
        yr1 = sb1.toString();
        String yr2 = scanner.nextLine();
        StringBuilder sb2 = new StringBuilder(yr2);
        sb2.insert(0, "Sat, 01-01-");
        yr2 = sb2.toString();
        System.out.println(yr1);
        System.out.println(yr2);
        LocalDate date1 = LocalDate.parse(yr1, formatter);
        LocalDate date2 = LocalDate.parse(yr2, formatter);
        long days = ChronoUnit.CENTURIES.between(date1, date2);
        System.out.println(days);
        int count = 0;
        while (!date1.isAfter(date2)) {
            if (date1.getDayOfWeek() == DayOfWeek.SUNDAY) {
                count++;
            }
            date1 = date1.plusDays(1);
        }
        // System.out.println(count);
        // while (!year1.isAfter(year2)) {
        // if (year1.isLeapYear()) {
        // System.out.println(year1.getYear());
        // }
        // year1 = year1.plusYears(1);
        // }

        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        // String datestr = scanner.nextLine();
        // LocalDate date = LocalDate.parse(datestr, formatter);
        // int days = scanner.nextInt();
        // date = date.plusDays(days);
        // String finalstr = date.format(formatter);
        // System.out.println(finalstr);

        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern()
    }
}