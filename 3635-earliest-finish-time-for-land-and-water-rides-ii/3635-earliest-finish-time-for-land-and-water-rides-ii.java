class Solution {
    public int earliestFinishTime(int[] lt, int[] ld, int[] wt, int[] wd) {
        int ans=Integer.MAX_VALUE;
        int n1=lt.length;
        int n2=wt.length;
        
        return Math.min(solve(lt,ld,wt,wd,n1,n2),solve(wt,wd,lt,ld,n2,n1));
    }
    public int solve(int t1[],int d1[],int t2[],int d2[],int n1,int n2){
        int time=Integer.MAX_VALUE;
        for(int i=0;i<n1;i++){
            time=Math.min(time,t1[i]+d1[i]);
        }
        int ans=Integer.MAX_VALUE;
        
        for(int i=0;i<n2;i++){
            int temp=time;
            if(temp<t2[i]) temp=t2[i];
            ans=Math.min(ans,temp+d2[i]);
        }
        return ans;
    }
}