class Solution {
    private String rev( int i,int j,String s)
    {
        String re = "";
        for(int start = j;start>=i;start--)
        {
            re = re + s.charAt(start); 
        }
        return re;
    }
    private String add(int i,int j,String s)
    {
        String aa ="";
        for(int st = i;st<=j;st++)
        {
            aa = aa+s.charAt(st);


        }
        return aa;
    }
    public String reverseStr(String s, int k) {
        int i; 
        int j;
        String ans = "";int c;
        for(i = 0;i<s.length();)
        {
            c = 0;
        
        for(j = i,c=0;j<s.length() && c<k;j++,c++);
        if(j<s.length())  ans = ans + rev(i,j-1,s);
        else  
        {
            ans = ans + rev(i,j-1,s);
            break;
        }
       
        c= 0;
        int z;
        for(z = j;z<s.length() && c<k;z++,c++);
        if(z<s.length()) ans = ans + add(j,z-1,s);
        else 
        {
            ans = ans + add(j,z-1,s);
            break;
        }
        i = z;





        }


        return ans;

    }
    
}