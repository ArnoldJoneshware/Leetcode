class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        //st.push(s.charAt(0));
         st.push(s.charAt(0));

        for(int i = 1;i<s.length();i++)
        {
            if(s.charAt(i) >=48 && s.charAt(i)<=57)
            {
                st.pop();
               
            }
           
            else st.push(s.charAt(i));
            
        }
        //System.out.print(st);
        // String res = st.toString();
        // 
        StringBuilder res = new StringBuilder();
        for(char ch: st)
        {
            res.append(ch);
        }
        return res.toString();

        
    }
}