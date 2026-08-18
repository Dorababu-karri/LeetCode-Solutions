class Solution {
    public int minPenalty(int period, int[] lights, int[] arr) {
         
        int n=arr.length;
        int ans=0;
        int el=0;
        for(int i:lights) el=Math.max(el,i);
        for(int i=0;i<n;i++){ 
            int r=arr[i]%period;
            if(r>=el){
                ans=Math.max(ans,period-r);
            }
        }
        return ans;
    }
}