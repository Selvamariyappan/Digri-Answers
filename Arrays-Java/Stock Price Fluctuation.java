import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] pricesString = input.split(",");
        double[] prices = new double[pricesString.length];

        for (int i = 0; i < pricesString.length; i++) {
            prices[i] = Double.parseDouble(pricesString[i]);
        }

        double[] dailyChanges = calculateDailyChanges(prices);
        int significantChanges = countSignificantChanges(dailyChanges);
        int[] consecutiveTrends = countConsecutiveTrends(dailyChanges);

        System.out.println("Daily Percentage Changes:");
        for (double change : dailyChanges) {
            System.out.printf("%.2f%%\n", change);
        }

        System.out.println("\nNumber of Significant Price Changes (above 5%): " + significantChanges);

        System.out.println("\nConsecutive Trends:");
        for (int trend : consecutiveTrends) {
            System.out.println(trend + " days");
        }
    }

    // Calculates daily percentage changes
    public static double[] calculateDailyChanges(double[] prices) {
        double[] changes = new double[prices.length - 1];
        for (int i = 1; i < prices.length; i++) {
            changes[i - 1] = (prices[i] - prices[i - 1]) / prices[i - 1] * 100;
        }
        return changes;
    }

    // Counts significant price changes (above 5%)
    public static int countSignificantChanges(double[] changes) {
        int count = 0;
        for (double change : changes) {
            if (Math.abs(change) > 5) {
                count++;
            }
        }
        return count;
    }

    // Counts consecutive days of price increase or decrease
    public static int[] countConsecutiveTrends(double[] changes) {
        int[] trends = new int[2]; // 0 for increasing, 1 for decreasing
        int currentTrend = 0;
        for (double change : changes) {
            if (change > 0) {
                if (currentTrend != 0) {
                    trends[0]++;
                }
                currentTrend = 0;
            } else if (change < 0) {
                if (currentTrend != 1) {
                    trends[1]++;
                }
                currentTrend = 1;
            }
        }
        return trends;
    }
}