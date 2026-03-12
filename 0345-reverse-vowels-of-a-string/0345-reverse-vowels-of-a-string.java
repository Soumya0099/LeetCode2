class Solution {
    public String reverseVowels(String s) 
    {
        List<Character> list=new ArrayList<>();

        // String s2=s.toLowerCase();
        StringBuilder result=new StringBuilder();

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='A' || s.charAt(i)=='e'||s.charAt(i)=='E' ||s.charAt(i)=='i'||s.charAt(i)=='I' || s.charAt(i)=='o' ||s.charAt(i)=='O' || s.charAt(i)=='u' || s.charAt(i)=='U')
            {
                list.add(s.charAt(i));
            }

        }
        int index=list.size()-1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='A' || s.charAt(i)=='e'||s.charAt(i)=='E' ||s.charAt(i)=='i'||s.charAt(i)=='I' || s.charAt(i)=='o' ||s.charAt(i)=='O' || s.charAt(i)=='u' || s.charAt(i)=='U')
            {
                result.append(list.get(index));
                index--;
            }
            else
            {
                result.append(s.charAt(i));
            }

        }

        return result.toString();
        
    }
}