package ArraysPractice;

import java.util.Map;

public class StockBuyAndSell {


    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        // output will be 5 because we will buy at 1 and sell at 6
        System.out.println("Max Profit is by using two Loops " + maxProfitUsingTwoLoops(prices));
        System.out.println("Max Profit is by using One Loops " + maxProfitUsingOneLoop(prices));
    }

    private static int maxProfitUsingOneLoop(int[] prices) {
        // using one Loops
        int minSoFar = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            minSoFar = Math.min(minSoFar, prices[i]);
            int maxDiff = prices[i] - minSoFar;
            maxProfit = Math.max(maxProfit, maxDiff);


        }
        return maxProfit;
    }

    private static int maxProfitUsingTwoLoops(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {


            for (int j = i + 1; j < prices.length; j++) {
                int maxDiff = prices[j] - prices[i];

                maxProfit = Math.max(maxProfit, maxDiff);
            }
        }
        return maxProfit;
    }
}
