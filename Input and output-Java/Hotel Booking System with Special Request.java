import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String guestName = scanner.nextLine();
        String roomType = scanner.nextLine();
        int numberOfNights = scanner.nextInt();
        scanner.nextLine();
        String specialRequests = scanner.nextLine();
        
        System.out.println("Hotel Booking Confirmation:");
        System.out.printf("Guest Name: %s\n", guestName);
        System.out.printf("Room Type: %s\n", roomType);
        System.out.printf("Number of Nights: %d\n", numberOfNights);
        System.out.printf("Special Requests: %s\n", specialRequests);
        
        scanner.close();
    }
}