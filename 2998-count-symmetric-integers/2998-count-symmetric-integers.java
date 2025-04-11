class Solution {
    public boolean sum(int n,int pow)
    {
        // System.out.println(n+" "+pow);
        
        int a = n/pow;
        int b = n%pow;
        //int n1 = a;
        //nt n2 = b;
        int sum1 = 0;
        int sum2 = 0;
        while(a>0)
        {
            sum1+=a%10;
            a/=10;
        }
        while(b>0)
        {
            sum2+=b%10;
            b/=10;
        }
    //    if(sum1 == sum2) 
    //    {
    //     System.out.println(n1+" "+n2);
    //    }
       return sum1==sum2;
    }
    public int nod(int n)
    {
        int no = 0;
        while(n> 0)
        {
            no+=1;
            n/=10;
        }
        return no;
    }
    public int countSymmetricIntegers(int low, int high) {
        int pow ;
        int ct = 0;
        for(int i = low;i<=high;i++)
        {
            if(nod(i) %2==1) continue;
           pow = (int)Math.pow(10,(nod(i)/2));
           if(sum(i,pow)) ct+=1;
        }
        return ct;
        
    }
}