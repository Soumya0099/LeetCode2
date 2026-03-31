class Solution {
    public int maxProfit(int[] prices) 
    {
        int buy=Integer.MAX_VALUE;
        int max=0;

        for(int i=0;i<prices.length;i++)
        {
            if(buy>prices[i])
            {
                buy=prices[i];
            }
            else
            {
                int profit=prices[i]-buy;
                max=Math.max(max,profit);
            }
        }

        return max;

    }
}