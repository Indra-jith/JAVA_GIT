import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

class babluException extends Exception {
    public babluException(String message) {
        super(message);
    }
}

public class er_de {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int muttay = scanner.nextInt();
            if (muttay >= 10) {
                throw new babluException("ivde");
            }
            scanner.nextLine();
            String time = scanner.nextLine();
            time = time + ":00";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            LocalTime t1 = LocalTime.parse(time, formatter);
            System.out.println(t1.getHour() + "hours and " + t1.getMinute() + " minutes");
        } catch (babluException e) {
            System.out.println(e.getMessage());
        } catch (DateTimeParseException e) {
            System.out.println("invalid date");
        }
        // } catch (Exception e) {
        // System.out.println("bablu no zero enn pranjatile");
        // } finally {
        // System.out.println("bablu padichu");
        // }

    }
}
