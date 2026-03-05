class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
        List<Boolean> result=new ArrayList<>();
        int max=0;
        for(int i=0;i<candies.length;i++)
        {
           max=Math.max(candies[i],max);
        }

        for(int num:candies)
        {
            result.add(num+extraCandies>=max);
        }

        return result;
    }
}