import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String attendeeName = scanner.nextLine();
        boolean isAttending = scanner.nextBoolean();
        int numberOfGuests = scanner.nextInt();
        
        scanner.close();
        
        System.out.println("RSVP Confirmation:");
        System.out.println("Attendee Name: " + attendeeName);
        System.out.println("Attending: " + isAttending);
        System.out.println("Number of Guests: " + numberOfGuests);
    }
}