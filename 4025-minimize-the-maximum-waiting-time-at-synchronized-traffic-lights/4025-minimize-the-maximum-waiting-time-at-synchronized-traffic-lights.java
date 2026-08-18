class Solution {
    public int minPenalty(int period, int[] lights, int[] arr) {
        Arrays.sort(lights);
        int n=arr.length;
        int ans=0;
        int len=lights.length;
        int el=lights[len-1];
        for(int i=0;i<n;i++){
            int r=arr[i]%period;
            if(r>=el){
                ans=Math.max(ans,period-r);
            }
        }
        return ans;
    }
}