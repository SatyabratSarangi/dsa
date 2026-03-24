
public class Q8_buy_and_sell_stock {

    //greedy  approach
    /*public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price: prices) {
            min = Math.min(price, min);
            maxProfit = Math.max(maxProfit, price - min);
        }
        return maxProfit;
    }*/

    public static int maxProfit(int[] prices) {
        int maxprofit=0;
        int bp=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>bp)
            {
               int profit=prices[i]-bp;
               maxprofit=Math.max(profit,maxprofit);
            }else
            {
                bp=prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
