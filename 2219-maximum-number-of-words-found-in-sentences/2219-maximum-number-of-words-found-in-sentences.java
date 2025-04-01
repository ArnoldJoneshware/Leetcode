class Solution {
    public int mostWordsFound(String[] arr) {
        int size ;
        int l = 0;
        for(int i =0;i<arr.length;i++)
        {
            size = 1;
            for(int j = 0;j<arr[i].length();j++)
            {
                if(arr[i].charAt(j) == ' ') 
                {
                    size = size+1;

                }
                
                
            }
            if(size>l) l = size;

        }
        return l;

        
    }
}