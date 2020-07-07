public class StockBuySell {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int leastCost = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < leastCost) {
                leastCost = prices[i];
            } else if (-leastCost + prices[i] > maxProfit) {
                maxProfit = -leastCost + prices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        System.out.println(
            maxProfit(new int[] {7,1,5,4,3,5,6})
        );
    }
}
