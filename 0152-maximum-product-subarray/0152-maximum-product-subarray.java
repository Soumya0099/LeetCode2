class Solution {
    public int maxProduct(int[] nums) 
    {
        int maxpro=Integer.MIN_VALUE;
        int leftpro=1;
        int rightpr=1;

        int lp=nums.length-1;

        for(int v:nums)
        {
            leftpro=leftpro==0?1:leftpro;
            leftpro*=v;

            rightpr=rightpr==0?1:rightpr;
            rightpr*=nums[lp--];

            int max=Math.max(leftpro,rightpr);
            maxpro=Math.max(maxpro,max);
        }
        return maxpro;
    }
}