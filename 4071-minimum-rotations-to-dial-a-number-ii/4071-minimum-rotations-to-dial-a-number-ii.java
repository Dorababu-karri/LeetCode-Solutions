class Solution {
    public int dist(int a,int b){
            return Math.min(Math.abs(a-b),10-Math.abs(a-b));
    }
    public int minRotations(int n, String s) {
        int pre[]=new int[n+1];
        int initial=0;
        for(int i=1;i<=n;i++){
            int num=s.charAt(i-1)-'0';
            pre[i]=pre[i-1]+dist(initial,num);
            initial=num;
        }
        int ans=pre[n];
        initial=0;
        int num1=s.charAt(n-1)-'0';
        for(int i=0;i<n;i++){
            int num=s.charAt(i)-'0';
            int curr=pre[n]-dist(initial,num)+dist(initial,num1);
            ans=Math.min(ans,curr);
            initial=num;
        }
        return ans;
    }
}