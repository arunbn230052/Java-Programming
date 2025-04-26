import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TimeDateDemo {
    public static void main(String[] args) {
    
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date: " + currentDate);
        System.out.println("Current Time: " + currentTime);
        System.out.println("Current DateTime: " + currentDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted DateTime: " + formattedDateTime);

        LocalDateTime futureDateTime = currentDateTime.plusDays(10).plusHours(5);
        LocalDateTime pastDateTime = currentDateTime.minusWeeks(2).minusMinutes(30);
        System.out.println("Future DateTime (after 10 days & 5 hours): " + futureDateTime.format(formatter));
        System.out.println("Past DateTime (2 weeks ago & 30 mins ago): " + pastDateTime.format(formatter));

        LocalDate projectDeadline = LocalDate.of(2025, Month.DECEMBER, 31);
        if (currentDate.isBefore(projectDeadline)) {
            System.out.println("Project deadline is in the future.");
        } else {
            System.out.println("Project deadline has passed.");
        }

        long daysBetween = ChronoUnit.DAYS.between(currentDate, projectDeadline);
        System.out.println("Days left until project deadline: " + daysBetween);

        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Kathmandu"));
        System.out.println("Current time in Kathmandu: " + zonedDateTime.format(formatter));

        ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current time in New York: " + newYorkTime.format(formatter));

        LocalDateTime meetingTime = LocalDateTime.of(2025, 5, 20, 14, 30);
        System.out.println("Scheduled meeting time: " + meetingTime.format(formatter));
    }
}
