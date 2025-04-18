import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();
        sumofdigits(num);
    }
    public static int sumofdigits(int num){
        int rem , sum = 0 ;
        while(num != 0){
            rem = num%10;
            sum += rem;
            num /= 10;
        }

        System.out.println("The sum of the digits is: " + sum);
        return 0;
    }
}
