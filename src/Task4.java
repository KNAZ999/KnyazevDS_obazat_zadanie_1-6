//Спроектируйте и разработайте метод, определяющий, сколько времени
//прошло с заданной даты. С помощью этого методы выведите в
//консоль, сколько времени прошло с вашего дня рождения в удобном
//для восприятия виде, например: Вам исполнилось 20 лет, 3 месяца, 18
//дней, 4 часа, 5 минут и 10 секунд.

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class Task4 {
   public static void main(String[] args) {

      System.out.println(dateburn());
   }

   public static String dateburn () {
            LocalDateTime today = LocalDateTime.of(2024, 05, 20, 15, 27,30);
            LocalDateTime birthday = LocalDateTime.of(1991, 05, 15, 13, 17,20);
            Period period = Period.between(birthday.toLocalDate(), today.toLocalDate());
            Duration duration = Duration.between(birthday.toLocalTime(), today.toLocalTime());
            return ("Вам исполнилось: " +
            period.getYears() + " years " +
            period.getMonths() + " months " +
            period.getDays() + " days " +
            duration.toHoursPart() + " hours " +
            duration.toMinutesPart() + " minutes " +
            duration.toSecondsPart() + " seconds.");
   }
}