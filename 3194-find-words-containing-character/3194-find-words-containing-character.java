class Solution {
    public boolean check(String s,char x)
    {
        for(int i = 0;i<s.length();i++)
        {
            if(s.charAt(i)==x) return true;
        }
        return false;
    }
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> map = new ArrayList<>();
        int y = 0;
        for(int i = 0;i<words.length;i++)
        {
            if(check(words[i],x)) map.add(y);
            y++;


        }
        return map;
    }
}