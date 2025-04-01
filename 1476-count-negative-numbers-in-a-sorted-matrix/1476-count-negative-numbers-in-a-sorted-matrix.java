class Solution {
    public int countNegatives(int[][] grid) {
        int ct = 0;
        for(int i = grid.length-1;i>=0;i--)
        {
            for(int j = grid[i].length-1;j>=0;j--)
            {
                if(grid[i][j]<0) ct+=1;
                else break;
            }
        }
        return ct;

        
    }
}