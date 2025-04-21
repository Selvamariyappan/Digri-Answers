import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] temperatures = new double[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            temperatures[i] = scanner.nextDouble();
            sum += temperatures[i];
        }

        double average = sum / n;
        double max = temperatures[0];
        double min = temperatures[0];

        for (int i = 0; i < n; i++) {
            if (temperatures[i] > average) {
                System.out.print(temperatures[i] + " ");
            }
            if (temperatures[i] > max) {
                max = temperatures[i];
            }
            if (temperatures[i] < min) {
                min = temperatures[i];
            }
        }

        System.out.println();
        System.out.println("Average Temperature: " + average);
        System.out.println("Maximum Temperature: " + max);
        System.out.println("Minimum Temperature: " + min);

        scanner.close();
    }
}