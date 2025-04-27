class Solution {
    public int countSubarrays(int[] nums) {
        int l =0;
        int r = 2;
        
        int ct = 0;
        while(r<nums.length)
        {
            if((double)(nums[l]+nums[r])== (double)(nums[l+1])/2) ct+=1;
            l+=1;
            r+=1;

        }
        return ct;
    }
}