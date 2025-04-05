class Solution {
    public boolean areNumbersAscending(String s) {
        List<Integer> mylist = new ArrayList<>();
        int res = 0;
        // String
        // String res = 
        for(int i = 0;i<s.length();i++)
        {
            while(i<s.length() && s.charAt(i) >='0' && s.charAt(i)<='9') 
            {
                res = res *10 + (int)(s.charAt(i) - '0');
                i++;
            }
            if(res>0) mylist.add(res);
            res = 0;


        }
        for(int x = 0;x<mylist.size()-1;x++)
        {
            if(mylist.get(x)>=mylist.get(x+1)) return false;

        } 
        return true;
        
    }
}