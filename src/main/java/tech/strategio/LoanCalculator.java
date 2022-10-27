package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * First we run a for loop 3 times, which stands for the number of months
     * In each iteration we are finding the 10 % percent of the amount owed and then
     * subtracting it from the current total amount owed.
     * @param int
     * @return int
     */
    static int getRemainingAmountIn3Months(int amount) {
        for (int x = 0; x < 3; x++) {
            amount -= ((amount * 10) / 100);
        }
        return amount;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
