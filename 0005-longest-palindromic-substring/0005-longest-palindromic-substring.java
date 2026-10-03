class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        if(n<=1) return s;
        int ans=1,start=0;
        boolean dp[][]=new boolean[n][n];
        for(int i=0;i<n;i++){
            dp[i][i]=true;
            for(int j=0;j<i;j++){
                if(s.charAt(j)==s.charAt(i) && ((i-j)<=2 || dp[j+1][i-1])){
                    dp[j][i]=true;
                    if(ans<i-j+1){
                        start=j;
                        ans=i-j+1;
                    }
                }
            }
        }
        return s.substring(start,start+ans);
    }
}