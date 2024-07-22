import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
import java.util.Scanner;

public class YearCalendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM yyyy");

        for (int month = 1; month <= 12; month++) {
            LocalDate date = LocalDate.of(year, month, 1);
            System.out.println("\n" + date.format(formatter));

            System.out.println("Sun Mon Tue Wed Thu Fri Sat");

            int fw = date.getDayOfWeek().getValue(); 

            for (int i = 1; i < fw; i++) {
                System.out.print("    ");
            }
            int dm = date.lengthOfMonth();
            for (int day = 1; day <= dm; day++) {
                System.out.printf("%3d ", day);
                if ((day + fw - 1) % 7 == 0) {
                    System.out.println();
                }
            }
            System.out.println();
        }

    }
}
