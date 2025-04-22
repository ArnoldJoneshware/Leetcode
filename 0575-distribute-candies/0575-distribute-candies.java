class Solution {
    public int distributeCandies(int[] nums) {
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int i = 0;i<nums.length;i++)
        {
            mpp.put(nums[i],1);
        }
        return (nums.length/2)>mpp.size()?mpp.size():(nums.length/2);
    }
}