class Solution {
    
    public int minSumOfLengths(int[] arr, int target) {
         
        int n=arr.length;
        int dp[]=new int[n];
        int ans=Integer.MAX_VALUE;
        Arrays.fill(dp,ans);
        int pre=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<n;i++){
            pre+=arr[i];
            int k=pre-target;
            if(map.containsKey(k)){
                int prev=map.get(k);
                int len=i-prev;
                if(prev>=0 && dp[prev]!=Integer.MAX_VALUE)
                {
                    ans=Math.min(ans,dp[prev]+len);
                }
                dp[i]=len;
            }
            map.put(pre,i);
            if(i>0){
                dp[i]=Math.min(dp[i-1],dp[i]);
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
    
}