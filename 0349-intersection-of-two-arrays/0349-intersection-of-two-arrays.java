class Solution {
    public boolean present(int x,int[] n2)
    {
        for(int i = 0;i<n2.length;i++)
        {
            if(x == n2[i]) return true;
        }
        return false;
    }
    public int[] intersection(int[] n1, int[] n2) {
        Set<Integer> arr = new HashSet<>();
        for(int i = 0;i<n1.length;i++)
        {
            if(present(n1[i],n2)) arr.add(n1[i]);
        }
        //System.out.print(arr);
        int[] res = new int[arr.size()];
        int ind =0;
        for(int x : arr)
        {
            res[ind++] = x;

        }
        return res;
    }
}