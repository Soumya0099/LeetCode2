class Solution {
    public boolean increasingTriplet(int[] nums) 
    {
        // boolean result=false;
        // if(nums.length>=3)
        // {
        //     for(int i=0;i<=nums.length-3;i++)
        //     {
        //         if(nums[i]<nums[i+1] && nums[i+1]<nums[i+2])
        //         {
        //             result=true;
        //         }

        //     }
        // }
        // return result;

        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;

        for(int i:nums)
        {
            if(i<=first)
            {
                first=i;
            }
            else if(i<=second)
            {
                second=i;
            }
            else
            {
                return true;
            }
        }
        return false;
        
    }
}