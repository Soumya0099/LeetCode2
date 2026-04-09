import java.util.*;
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) 
    {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int a:nums1)
        {
            set1.add(a);
        }
        for(int b:nums2)
        {
            set2.add(b);
        }

        for(Integer a:set1)
        {
            if(!set2.contains(a))
            list1.add(a);
        }
        for(Integer b:set2)
        {
            if(!set1.contains(b))
            list2.add(b);
        }

        return Arrays.asList(list1,list2);
    }
}