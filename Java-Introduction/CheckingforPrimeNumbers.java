import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        int number = scanner.nextInt();
        scanner.close();
        
        if (number == 1) {
            System.out.println(number + " is not a prime number.");
        } else if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
    
    public static boolean isPrime(int number) {
        
        if (number <= 1) {
            return false;
        }
        
        
        if (number == 2) {
            return true;
        }
        
        
        if (number % 2 == 0) {
            return false;
        }
        
        
        int sqrt = (int) Math.sqrt(number);
        for (int i = 3; i <= sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}