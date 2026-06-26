class Solution {
    public int minLights(int[] light) {
        int n=light.length;
        int vis[]=new int[n];
        for(int i=0;i<n;i++){
            if(light[i]>0){
                int st=Math.max(0,i-light[i]);
                int end=Math.min(n-1,i+light[i]);
                vis[i]=1;
                int j=i-1;
                while(j>=st){
                    if(vis[j]==1) break;
                    vis[j]=1;
                    j--;
                }
                while(st<=(i-1)){
                    if(vis[st]==1) break;
                    vis[st]=1;
                    st++;
                }
                while(end>=(i+1)){
                    if(vis[end]==1) break;
                    vis[end]=1;
                    end--;
                }
            }
        }
        int count=0;
        int ans=0;
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                count++;
            }else{
                ans=ans+(count/3);
                if(count%3!=0) ans++;
                count=0;
            }
        }
        ans=ans+(count/3);
        if(count%3!=0) ans++;
        return ans;
         
    }
}