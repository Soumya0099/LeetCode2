class Solution {
    public boolean isPalindrome(int x)
    {
       String value=Integer.toString(x);
       StringBuilder sc=new StringBuilder(value);
       if(sc.reverse().toString().equals(value))
       {
        return true;
       }
       else
       {
        return false;
       }
        
    }
}