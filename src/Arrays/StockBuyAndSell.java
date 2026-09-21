package Arrays;
// input = {1,5,3,1,2,8}
// output=11 {Maximize Profit}
// input2 = {1,5,3,8,12}
// output =13 {Maximize Profit}
// input3 = {30,20,10}
//output =0
// input4 = {10,20,30}
// output=20
public class StockBuyAndSell {
    public static void main(String[] args) {
        // price of profit
        int price[] = new int[] {7,1,5,3,6,4};
        int start = 0;
        int end = price.length - 1;
        maxProfit(price, start, end);
        System.out.println("Maximum Profit is[Geeks1]->" + maxProfit(price, start, end));
        System.out.println();
        System.out.println("Maximum Profit is[Second Method]-> " + maxProfitBetter(price));
        System.out.println();
        System.out.println("Maximum Profit is[Third Method[]geeks]-> " +  maxProfitMuchBetter(price));
    }
    private static int maxProfit(int[] price, int start, int end) {
        if (end <= start) {
            return 0;
        }

        int profit = 0;
        for (int i=start; i < end; i++)
        {
            for (int j = i + 1; j <= end; j++)
            {
                if (price[j] > price[i])
                {
                    int current_Profit = price[j] - price[i] + maxProfit(price, start, i - 1) + maxProfit(price, j + 1, end);
                    profit = Math.max(profit, current_Profit);
                }
            }

        }

        return profit;
    }


    private static int maxProfitMuchBetter(int[] price) {
        int profit =0;
        for (int i = 1; i < price.length; i++) {
            if(price[i] > price[i-1])
            {
                profit+= price[i] - price[i-1];
            }



        }
        return profit;
    }

    private static int maxProfitBetter(int[] price) {
        int leastSoFar = Integer.MAX_VALUE;
        int overAllProfit = 0;
        int profitIfSoldToday = 0;

        for (int i = 0; i < price.length ; i++) {
            if(price[i] < leastSoFar)
            {
                leastSoFar = price[i];
            }
        profitIfSoldToday = price[i] -leastSoFar;

            if(profitIfSoldToday > overAllProfit)
            {
                overAllProfit = profitIfSoldToday;
            }
        }
       return overAllProfit;
    }


}