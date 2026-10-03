class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch1=new char[26];
        char[] ch2=new char[26];
        for(char ch:s.toCharArray()){
            ch1[ch-'a']+=1;
        }
        for(char ch:t.toCharArray()){
            ch2[ch-'a']+=1;
        }
        for(int i=0;i<26;i++) if(ch1[i]!=ch2[i]) return false;
        return true;
    }
}