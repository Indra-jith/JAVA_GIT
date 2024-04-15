import java.time.LocalDate;
import java.time.ZoneId;

public class date_time_prob {
    public static void main(String[] args) {
        ZoneId zone = ZoneId.of("America/New_York");
        LocalTime time1 = LocalTime.now(zone);
        System.out.println(time1);
    }
}
