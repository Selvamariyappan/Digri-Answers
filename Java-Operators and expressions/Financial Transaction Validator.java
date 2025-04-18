import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double transactionAmount = scanner.nextDouble();
        double balance = scanner.nextDouble();
        boolean isVerified = scanner.nextBoolean();

        String status = (transactionAmount <= balance && isVerified) ? "Transaction approved" : "Transaction declined";

        System.out.println(status);

        scanner.close();
    }
}