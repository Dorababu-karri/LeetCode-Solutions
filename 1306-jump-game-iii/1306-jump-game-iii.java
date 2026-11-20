class Solution {
    static int arr[],n;
    public boolean canReach(int[] arr, int start) {
         
        this.arr=arr;
        this.n=arr.length;
        System.out.println(n);
        boolean vis[]=new boolean[n];
        return helper(start,vis);
    }
    public boolean helper(int idx,boolean vis[]){
        if(idx<0 || idx>=n) return false;
        if(vis[idx]) return false;
        vis[idx]=true;
        if(arr[idx]==0) return true;
        boolean r=helper(idx+arr[idx],vis);
        boolean l=helper(idx-arr[idx],vis);
        return r||l;
    }
}