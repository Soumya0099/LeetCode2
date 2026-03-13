class Solution {
    public String reverseWords(String s) 
    {
        String[] sarr=s.trim().split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=sarr.length-1;i>=0;i--)
        {
            if(!sarr[i].isEmpty()){
                sb.append(sarr[i]).append(" ");
                // sb;
            }
            // sb.append(sarr[i]).append(" ");
            
        }
        return sb.toString().trim();
        
    }
}