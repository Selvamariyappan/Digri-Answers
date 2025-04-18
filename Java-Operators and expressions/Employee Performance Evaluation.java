import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hoursWorked = scanner.nextInt();
        int projectsCompleted = scanner.nextInt();
        int overtimeHours = scanner.nextInt();

        int totalHoursWorked = hoursWorked + overtimeHours;

        if (projectsCompleted > 5 && hoursWorked >= 160) {
            System.out.println("Mark qualifies for a bonus.");
        } else {
            System.out.println("Mark does not qualify for a bonus.");
        }

        scanner.close();
    }
}