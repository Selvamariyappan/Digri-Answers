import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int ticketID = scanner.nextInt();
        scanner.nextLine(); 
        
        String customerName = scanner.nextLine();
        
        String issueDescription = scanner.nextLine();
        
        String priorityLevel;
        while (true) {
            priorityLevel = scanner.nextLine().toUpperCase();
            
            if (priorityLevel.equals("HIGH") || priorityLevel.equals("MEDIUM") || priorityLevel.equals("LOW")) {
                break; 
            } else {
                System.out.println("Invalid priority level. Please enter High, Medium, or Low.");
            }
        }
        
        System.out.println("Support Ticket:");
        System.out.printf("Ticket ID: %d\n", ticketID);
        System.out.printf("Customer Name: %s\n", customerName);
        System.out.printf("Issue Description: %s\n", issueDescription);
        System.out.printf("Priority Level: %s\n", priorityLevel);
        
        scanner.close();
    }
}