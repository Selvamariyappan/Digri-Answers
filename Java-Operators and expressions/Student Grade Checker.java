import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int marks = scanner.nextInt();

        String result = (marks >= 85) ? "The student qualifies for the award." : "The student does not qualify for the award.";

        System.out.println(result);

        scanner.close();
    }
}