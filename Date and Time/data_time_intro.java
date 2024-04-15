import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class data_time_intro {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        date = date.plusDays(1);
        System.out.println(date);
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalDateTime datetime = LocalDateTime.now();
        System.out.println(datetime);
        System.out.println("Before formatting : " + datetime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss -a G");
        // Can customize it anyway (refer documentations for format)
        System.out.println("After formatting " + datetime.format(formatter));
    }
}
