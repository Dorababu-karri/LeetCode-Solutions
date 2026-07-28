class Solution {
    public String smallestPalindrome(String s) {
        int count[]=new int[26];
        for(char ch:s.toCharArray()){
            count[ch-'a']+=1;
        }
        StringBuilder sb=new StringBuilder();
        StringBuilder mid=new StringBuilder();

        for(int i=0;i<26;i++){
            if(count[i]%2!=0)  mid.append((char)('a'+i));
            int cnt=(count[i])/2;
            while(cnt-->0) sb.append((char)('a'+i));
        }
        StringBuilder rev=new StringBuilder(sb);
        rev.reverse();
        return sb.toString()+mid.toString()+rev.toString();
    }
}