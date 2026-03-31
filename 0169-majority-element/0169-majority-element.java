import java.util.*;
class Solution {
    public int majorityElement(int[] nums)
    {
        int value=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a:nums)
        {
            if(map.containsKey(a))
            {
                map.put(a,map.get(a)+1);
            }
            else
            {
                map.put(a,1);
            }
        }

        for(Map.Entry<Integer,Integer> m:map.entrySet())
        {
            if(m.getValue()>nums.length/2)
            {
                value=m.getKey();
            }

        }

        return value;
        
    }
}