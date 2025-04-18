import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        String citizenship = scanner.next();


        String eligibility = (age >= 18 && citizenship.equals("Indian")) ? 
                            "Citizen is eligible to vote." : 
                            "Citizen is not eligible to vote.";

        System.out.println(eligibility);
        
        scanner.close();
    }
}