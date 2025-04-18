import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = scanner.nextDouble();
        int quantity = scanner.nextInt();
        boolean isMember = scanner.nextBoolean();

        double finalPrice;

        if (isMember && quantity > 10) {
            finalPrice = price * 0.85;
        } else {
            finalPrice = price;
        }

        System.out.println("The final price of the product is: " + finalPrice);

        scanner.close();
    }
}