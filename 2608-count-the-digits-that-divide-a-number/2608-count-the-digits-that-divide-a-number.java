class Solution {
    public int countDigits(int num) {
       if(num<10) return 1;
       int temp = num;
       int ct = 0;
       
       while(temp > 0)
       {
        if(temp%10==0) temp/=10;
        else
        {
            if(num%(temp%10)==0) ct+=1;
            temp/=10;
        }
        
        
       }
       return ct;
    
        
        
    }
}