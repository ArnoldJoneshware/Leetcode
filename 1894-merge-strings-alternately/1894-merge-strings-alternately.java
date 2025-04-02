class Solution {
    public String mergeAlternately(String s, String t) {
        int i = 0;
        int j = 0;
        String res = "";
        int size ;
        if(s.length()>t.length()) size = s.length();
        else size = t.length();
        while(i<size || j<size)
        {
            if(i<s.length()) res = res+s.charAt(i);
            if(j<t.length()) res = res+t.charAt(j);
            i = i+1;
            j = j+1;

        }
        return res;
        
        
    }
}