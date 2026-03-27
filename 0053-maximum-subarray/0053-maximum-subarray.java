class Solution {
    public int maxSubArray(int[] nums) 
    {
        int maxsum=Integer.MIN_VALUE;
        int currentsum=0;

        for(int i=0;i<nums.length;i++)
        {
            currentsum+=nums[i];
            maxsum=Math.max(maxsum,currentsum);

            currentsum=currentsum<=0?0:currentsum;
        }
        return maxsum;
        
    }
}