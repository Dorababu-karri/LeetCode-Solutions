class Solution {
    String a,b;
    int dp[][];
    public int minDistance(String word1, String word2) {
        a=word1;
        b=word2;
        int n1=word1.length();
        int n2=word2.length();
        dp=new int[n1][n2];
        for(int i=0;i<n1;i++) Arrays.fill(dp[i],-1);
        return helper(n1-1,n2-1);
    }
    public int helper(int i,int j){
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(a.charAt(i)==b.charAt(j)) return dp[i][j]=helper(i-1,j-1);
        int insert=helper(i-1,j);
        int replace=helper(i-1,j-1);
        int delete=helper(i,j-1);
        return dp[i][j]=1+Math.min(insert,Math.min(replace,delete));
    }
}