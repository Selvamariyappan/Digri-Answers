import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int firstNumber = scanner.nextInt();
        
        
        int secondNumber = scanner.nextInt();
        
        scanner.close();
        
        
        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        
        
        if (secondNumber == 0) {
            System.out.println("Division: Error - Division by zero is not allowed.");
        } else {
            int division = firstNumber / secondNumber;
            System.out.println("Division: " + division);
        }
    }
}