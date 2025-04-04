class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
         Arrays.sort(arr1);
         Arrays.sort(arr2);
        //for(char x : arr1) System.out.print(x+" ");
        //System.out.println();
       
        //for(char y : arr2) System.out.print(y+" ");
        //System.out.println();
        for(int i = 0;i<s.length();i++)
        {
            if(arr1[i] != arr2[i]) return false;
        }
        return true;



        
    }
}