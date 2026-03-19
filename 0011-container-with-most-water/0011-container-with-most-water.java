import java.util.*;
class Solution {
    public int maxArea(int[] height) 
    {
        long maxarea=0;
        int left=0;
        int right=height.length-1;

        while(left<right)
        {
            long area=Math.min(height[left],height[right])*(right-left);
            maxarea=Math.max(area,maxarea);

           if (height[left] <= height[right])
           {
              left++;       
           } 
           else
            right--;

        }
        return (int)maxarea;
    }
}