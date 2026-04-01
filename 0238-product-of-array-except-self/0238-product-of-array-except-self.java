class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int n=nums.length;
        int[] answer=new int[n];
        int sum=1;
        int count=0;

        for(int i:nums)
        {
            if(i!=0)
            {
                sum*=i;   
            }
            else
            {
                count++;
            }
            
        }
        if(count>=2)
        {
            return answer;
        }
        else if(count==1)
        {
            for(int i=0;i<n;i++)
            {
                if(nums[i]==0)
                answer[i]=sum;
            }
        }
        else
        {
           for(int i=0;i<n;i++)
            {
                answer[i]=sum/nums[i];
            } 
        }

        return answer;
    }
}