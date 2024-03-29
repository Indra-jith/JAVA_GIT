
/*
 * Date in java -> long number -> milliseconds passed since 1 jan 1970
 * assumes 1900 is start year
 * System.currentTimeMillis() returns number of seconds passed
 * seconds -> millisecond/1000
 * minutes -> seconds/60
 * hour -> minutes/60
 * day -> hour/24
 * months -> day/30.417
 * year -> months/12
 */

// import java.time.LocalDate;
// import java.time.format.DateTimeFormatter;
// import java.time.DayOfWeek;
// import java.util.Scanner;
// import java.time.temporal.ChronoUnit;
// import java.time.Duration;
// import java.time.LocalDateTime;

// import java.time.LocalDate;
// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;
// import java.time.temporal.ChronoUnit;
// import java.time.DayOfWeek;

// public class datess {
// public static void main(String[] args) {
// String str1 = "16-09-2000";
// String str2 = "10-10-2004";
// // String str3 = "16-09-2003 12:16:20";
// // LocalDateTime d4 = LocalDateTime.now();
// // System.out.println(d4);
// DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
// // DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy
// // HH:mm:SS");
// LocalDate d1 = LocalDate.parse(str1, formatter1);
// LocalDate d2 = LocalDate.parse(str2, formatter1);

// // LocalDateTime d3 = LocalDateTime.parse(str3, formatter2);
// // System.out.println(d3);
// // long days = ChronoUnit.DAYS.between(d1, d2);

// // int count = 0;
// // while (!d1.plusDays(1).equals(d2.minusDays(1))) {
// // if (d1.getDayOfWeek().equals(DayOfWeek.MONDAY)) {
// // count++;
// // }
// // d1 = d1.plusDays(1);
// // }
// LocalDate t1 = LocalDate.of(2003, 9, 16);

// int count = 0;
// while (d1.getYear() != (d2.plusYears(1).getYear())) {
// if (d1.getYear() % 400 == 0 || (d1.getYear() % 4 == 0 && d1.getYear() % 100
// != 0)) {
// count++;
// }
// d1 = d1.plusYears(1);
// }
// System.out.println(count);
// // d1 = d1.plusYears(1);
// // System.out.println(d1);
// // String finalans = d1.format(formatter);
// // System.out.println(finalans);

// }
// }
