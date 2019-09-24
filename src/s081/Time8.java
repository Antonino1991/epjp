package s081;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Time8 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println(LocalDate.of(2019, Month.JUNE, 2));
        System.out.println(LocalDate.of(2019, 6, 2));
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime ldt = LocalDateTime.of(date, time);
        System.out.println(ldt);
        
        Duration d = Duration.ofDays(2);
        System.out.println(d);
        Duration x = Duration.of(12, ChronoUnit.HALF_DAYS); 
        System.out.println(x);
    }
}
