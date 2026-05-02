import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class LaunchDateTime {
    static void main(String[] args) {
        // util, sql Date, DateTime deprecated
        // joda api ==> time api ==> time package

//        Date dateTime = new Date();
//        System.out.println(dateTime);
//        int time = dateTime.getMinutes();
//        System.out.println(time);
//        int hours = dateTime.getHours();
//        System.out.println(hours);


        LocalDate ld = LocalDate.now(); // Current date

        System.out.println(ld);

        LocalDate ld2 = LocalDate.of(2023, 10, 15); // Customized date
        System.out.println(ld2);

        LocalTime lt = LocalTime.now(); // current time including nanoseconds

        System.out.println(lt);

        LocalTime lt2 = LocalTime.of(00, 02, 00); // customized time

        System.out.println(lt2);

        LocalDateTime ldt = LocalDateTime.now(); // current date and time

        System.out.println(ldt);

        int doy = ldt.getDayOfYear();

        System.out.println(doy);

        int hr = ldt.getHour();

        System.out.println(hr);
        int min = ldt.getMinute();
        int sec = ldt.getSecond();
        int nano = ldt.getNano();

        System.out.println(min);
        System.out.println(sec);
        System.out.println(nano);

    }
}
