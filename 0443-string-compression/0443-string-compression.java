import java.util.*;
class Solution {
    public int compress(char[] chars) 
    {
        int idx=0;
        int count=1;

        for(int i=0;i<chars.length;i++)
        {
            if(i+1<chars.length && chars[i]==chars[i+1]){
                count++;
            }
            else{ 
                chars[idx++]=chars[i];
                if(count>1) {
                    for(char c:String.valueOf(count).toCharArray())
                     chars[idx++]=c;  
                } 
                count=1;
            }   
        }
        return idx;
    }
}