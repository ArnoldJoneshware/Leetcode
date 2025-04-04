class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
       
            // for(int i = 0;i<mat.length;i++)
            // {
            //     for(int j= 0;j<mat.length;j++)
            //     {
            //         if(i+j == mat.length-1) sum+=mat[i][j];
            //         if(i == j) sum+=mat[i][j];
            //         if(i+j == mat.length-1 && i==j) sum -= mat[i][j];
            //     }
            // }
            int i;
            int j;
            for(i = 0;i<mat.length;i++)
            {
                sum +=mat[i][i];
            }
            for( i= 0,j = mat.length-1;i<mat.length;i++,j--)
            {
                sum+=mat[i][j];
                if(i == j) sum-=mat[i][j];
             }
            
            return sum;
        
        
    }
}