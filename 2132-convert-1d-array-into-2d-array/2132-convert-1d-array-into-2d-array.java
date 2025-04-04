class Solution {
    public int[][] construct2DArray(int[] arr, int m, int n) {
        int[][] mat = new int[m][n];
        int ind = 0;

        for(int i = 0;i<m;i++)
        {
            for(int j = 0;j<n;j++)
            {
                if(ind<arr.length) mat[i][j] = arr[ind++];
                else  return new int[][]{};


            }
        }
        //System.out.print(ind+" "+(arr.length));
        if(ind != arr.length ) return new int[][]{};
        return mat;
        
    }
}