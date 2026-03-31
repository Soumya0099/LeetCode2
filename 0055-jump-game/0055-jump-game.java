class Solution {
    public boolean canJump(int[] nums) 
    {
        // boolean value=false;
        // int idx=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]==0 && i!=nums.length-1)
        //     {
        //         value=false;
        //         idx=i;
        //         break;
        //     }
        //     else
        //     {
        //         value=true;
        //     }    
        // }

        int reachable=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>reachable) return false;

            reachable=Math.max(reachable,i+nums[i]);
        }
        return true;
        
    }
}