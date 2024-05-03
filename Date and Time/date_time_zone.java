import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class date_time_zone {
    public static void main(String[] args) {
        ZoneId id = ZoneId.of("America/New_York");
        LocalDateTime time = LocalDateTime.of(2024, 5, 3, 16, 39, 0);
        ZonedDateTime zoned = time.atZone(id);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
        System.out.println(zoned.format(formatter));
    }
}
