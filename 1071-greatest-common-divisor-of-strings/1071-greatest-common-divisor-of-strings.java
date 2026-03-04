class Solution {
    int gcd(int a,int b)
    {
        if(b!=0)
        {
            return gcd(b,a%b);
        }
        else
        {
            return a;
        }
    }
    public String gcdOfStrings(String str1, String str2) 
    {
        if(str1.concat(str2).equals(str2.concat(str1)))
        {
            int value=gcd(str1.length(),str2.length());

            return str1.substring(0,value);

        }
        else
        {
            return "";
        }
    }
}