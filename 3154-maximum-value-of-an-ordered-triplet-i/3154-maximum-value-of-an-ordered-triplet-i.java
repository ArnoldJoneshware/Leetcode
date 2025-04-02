class Solution {
    public long maximumTripletValue(int[] nums) {
        long l = 0;
        // int a ;
        // int b;
        // int c;
        long sum = 0;
        
        for(int i = 0;i<nums.length-2;i++)
        {
            for(int j = i+1;j<nums.length-1;j++)
            {
                for(int z = j+1;z<nums.length;z++)
                {
                    sum = ((long)nums[i] - (long)nums[j])*(long)nums[z];
                    if(sum>l) l = sum;
                    
                }
            }
        }
       if(l<0) return 0;
        return l;

        
    }
}