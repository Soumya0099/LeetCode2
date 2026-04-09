class Solution {
    public boolean uniqueOccurrences(int[] arr) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int a:arr)
        {
            map.put(a,map.getOrDefault(a,0)+1);
        }

        Set<Integer> se=new HashSet<>();

        for(Map.Entry<Integer,Integer> entries:map.entrySet())
        if(!se.add(entries.getValue()))
        {
            return false;
        }
        return true;
    }
}