class Solution {
    public boolean checkIfPangram(String sentence) 
    {
        String s=sentence.replace(" ","").toLowerCase();
        boolean result=false;
        // System.out.println(s);
        
        String all="abcdefghijklmnopqrstuvwxyz";
        char[] c=all.toCharArray();
        
        for(char value:c)
        {
            if(!s.contains(String.valueOf(value)))
            {
                result=false;
                break;
            }
            else
            {
                result=true;
            }
        }
        return result;
        
    }
}