class Solution {
    private int token (int ini,int fin,String s,int token)
    {
        int hy_ct = 0;
        int pu_ct = 0;
        //boolean flag = false;
        int i;
        for(i = ini;i<=fin;i++) 
        {
            if(s.charAt(i) >=48 && s.charAt(i)<=57) return token;

        }
        if(s.charAt(ini) == '-' || s.charAt(fin)=='-') return token;
        //if(ini == fin && s.charAt(ini) != '-') return token+=1;
        if(ini == fin && s.charAt(ini) == '-') return token;
        for(i = ini;i<fin;i++)
        {
            if(s.charAt(i) == '!'||s.charAt(i) == ','||s.charAt(i) == '.') return token;
            if(s.charAt(i) == '-') 
            {
                if(i+1<=fin && s.charAt(i+1)==','||s.charAt(i+1)=='!'||s.charAt(i+1)=='.') return token;
                hy_ct+=1;
            }
            if(hy_ct>1) return token;
        }
        
        //System.out.println("token - "+flag);
        for(int z = ini;z<=fin;z++) System.out.print(s.charAt(z)+" ");
        System.out.println();
       
        return token+1;
    }
    public int countValidWords(String s) {
        s = s.trim();
        int token = 0;
        // int hy_ct = 0;
        // int pu_ct = 0;
        int i;
        int j;
        
        
        
        
        
        
        for(j = 0;j<s.length();)
        {
        for(i = j;i<s.length() && s.charAt(i)!=' ';i++);
        token = token(j,i-1,s,token);
        j = i+1;
        while(j<s.length() && s.charAt(j)==' ') j++;
        
        }
        return token;
    }
}
//token - falsetoken - falsetoken - truetoken - truetoken - falsetoken - true