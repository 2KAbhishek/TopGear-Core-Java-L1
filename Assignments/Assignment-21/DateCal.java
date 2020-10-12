import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;
import java.time.ZoneId;

public class DateCal {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar(1947, 7, 15);
        cal.add(GregorianCalendar.DAY_OF_MONTH, 90);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, LLLL d, yyyy");
        System.out.println(cal.getTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().format(formatter));
    }
}
