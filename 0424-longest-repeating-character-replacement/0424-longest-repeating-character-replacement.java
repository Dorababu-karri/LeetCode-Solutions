class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int n=s.length();
        int[] freq=new int[26]; 
        int ans=0,maxFreq=0;
        for(int right=0;right<n;right++){
            char ch=s.charAt(right);
            freq[ch-'A']+=1;
            maxFreq=Math.max(maxFreq,freq[ch-'A']);
            int len=right-left+1;
            if((len-maxFreq)>k){
                freq[s.charAt(left)-'A']-=1;
                left++;
            }
           
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}