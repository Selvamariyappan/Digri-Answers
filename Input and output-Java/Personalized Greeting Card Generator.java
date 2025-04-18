import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        
        String[] parts = input.split(",", 4);
        
        String recipientName = parts[0].trim();
        String occasion = parts[1].trim();
        String message = parts[2].trim();
        String senderName = parts[3].trim();
        
        System.out.println("To: " + recipientName + ",");
        
        if (occasion.equalsIgnoreCase("Birthday")) {
            System.out.println("Happy Birthday!,");
        } else if (occasion.equalsIgnoreCase("Graduation")) {
            System.out.println("Congratulations on your Graduation!,");
        } else {
            System.out.println("Happy " + occasion + "!,");
        }
        
        System.out.println(message);
        System.out.println("From: " + senderName);
        
        scanner.close();
    }
}