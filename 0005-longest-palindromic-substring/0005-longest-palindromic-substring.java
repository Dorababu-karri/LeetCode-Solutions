class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int ans=0,start=0;
        boolean dp[][]=new boolean[n+1][n+1];
        for(int i=0;i<=n;i++){
            dp[i][i]=true;
            for(int j=0;j<i;j++){
                if(s.charAt(j)==s.charAt(i-1) && ((i-j<=2) || dp[j+1][i-1])){
                    dp[j][i]=true;
                    if(ans<i-j){
                        start=j;
                        ans=i-j;
                    }
                }
            }
        }
        return s.substring(start,start+ans);
    }
}