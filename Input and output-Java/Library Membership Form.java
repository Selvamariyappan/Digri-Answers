import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String memberName = scanner.nextLine();
        int memberID = scanner.nextInt();
        scanner.nextLine();
        String membershipType = scanner.nextLine();
        double subscriptionFee = scanner.nextDouble();
        
        System.out.println("Library Membership Form:");
        System.out.println("Name: " + memberName);
        System.out.println("Membership ID: " + memberID);
        System.out.println("Membership Type: " + membershipType);
        System.out.printf("Subscription Fee: %.2f", subscriptionFee);
        
        scanner.close();
    }
}