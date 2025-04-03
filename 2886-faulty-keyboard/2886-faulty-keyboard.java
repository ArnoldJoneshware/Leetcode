class Solution {
    private String rev(int i,int j,String s)
    {
        String re ="";
        for(int st = j;st>=i;st--)
        {
            re = re+s.charAt(st);
        }
        return re;
    }
    public String finalString(String s) {
        String res ="";

        res = res+s.charAt(0);
        if(s.length() >=2 && s.charAt(1)!='i') res =res+s.charAt(1);
        for(int i = 2;i<s.length();i++)
        {
            if(s.charAt(i) == 'i') res = rev(0,res.length()-1,res);
            else res = res + s.charAt(i);
            // System.out.println(res);

        }
        return res;
    }
}