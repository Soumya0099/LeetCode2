class Solution {
    public int maxProfit(int[] prices) 
    {
        int hold= -prices[0];
        int nothold=0;

        for(int i=0;i<prices.length;i++)
        {
            int temp=nothold;
            nothold=Math.max(nothold,hold+prices[i]);
            hold=Math.max(hold,temp-prices[i]);
        }
        return nothold;
        
    }
}