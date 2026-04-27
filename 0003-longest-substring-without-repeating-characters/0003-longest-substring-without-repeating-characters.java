class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int r=0,l=0,max=0,n=s.length();
        HashSet<Character> set=new HashSet<>();

        for(r=0;r<n;r++)
        {
            while(set.contains(s.charAt(r)))
            {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            max=Math.max(max,r-l+1);
            // r++;
        }
        return max;
    }
}