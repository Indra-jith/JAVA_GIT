import java.time.LocalDate;
import java.time.ZoneId;
import java.time.LocalTime;

public class date_time_2 {
    public static void main(String[] args) {
        ZoneId zone = ZoneId.of("America/New_York");
        LocalTime time1 = LocalTime.now(zone);
        System.out.println(time1);
    }
}
