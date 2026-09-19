class Solution {
    public boolean isAnagram(String s, String t) {
         
        char arr1[]=new char[26];
        char arr2[]=new char[26];
        for(char ch:s.toCharArray()) arr1[ch-'a']+=1;
        for(char ch:t.toCharArray()) arr2[ch-'a']+=1;
        for(int i=0;i<26;i++) if(arr1[i]!=arr2[i]) return false;
        return true;
    }
}