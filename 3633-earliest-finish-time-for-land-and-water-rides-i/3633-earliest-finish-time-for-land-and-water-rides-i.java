class Solution {
    public int earliestFinishTime(int[] lt, int[] ld, int[] wt, int[] wd) {
        int ans=Integer.MAX_VALUE;
        int n1=lt.length;
        int n2=wt.length;
        for(int i=0;i<n1;i++){
            int total=lt[i]+ld[i];
            for(int j=0;j<n2;j++){
                int temp=total;
                if(total<wt[j]) temp=wt[j];
                 int end=temp+wd[j];
                 ans=Math.min(ans,end);
            }
        }
        for(int i=0;i<n2;i++){
            int total=wt[i]+wd[i];
            for(int j=0;j<n1;j++){
                int temp=total;
                if(total<lt[j]) temp=lt[j];
                 int end=temp+ld[j];
                 ans=Math.min(ans,end);
            }
        }
        return ans;
    }
}