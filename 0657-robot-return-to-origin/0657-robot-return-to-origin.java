class Solution {
    public boolean judgeCircle(String s) {
        int u = 0;
        int d = 0;
        int l = 0;
        int r = 0;
        for(int i = 0;i<s.length();i++)
        {
            if(s.charAt(i)=='U') u+=1;
            if(s.charAt(i)=='D') d+=1;
            if(s.charAt(i)=='L') l+=1;
            if(s.charAt(i)=='R') r+=1;


        }
        //System.out.print(u+" "+d+" "+l+" "+r);
         return u == d && l == r;


    }
}