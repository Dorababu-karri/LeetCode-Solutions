class Solution {
    
    public int minSumOfLengths(int[] arr, int target) {
         
        int n=arr.length;
        int dp[]=new int[n];
        int ans=Integer.MAX_VALUE;
        int minSofar=Integer.MAX_VALUE;
        Arrays.fill(dp,ans);
        int pre=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<n;i++){
            pre+=arr[i];
            int k=pre-target;
            if(map.containsKey(k)){
                int prev=map.get(k)+1;
                int len=i-prev+1;
                if(prev>0 && dp[prev-1]!=Integer.MAX_VALUE)
                {
                    ans=Math.min(ans,dp[prev-1]+len);
                }
                minSofar=Math.min(minSofar,len);
            }
            map.put(pre,i);
            dp[i]=minSofar;
            
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
    
}