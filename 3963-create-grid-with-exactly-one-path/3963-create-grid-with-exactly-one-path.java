class Solution {
    public String[] createGrid(int m, int n) {
        String ans[]=new String[m];
        for(int i=0;i<m-1;i++){
            ans[i]="";
            for(int j=0;j<n;j++){
                if(j==0){
                    ans[i]+=".";
                }else{
                    ans[i]+="#";
                }
            }
        }
        ans[m-1]="";
        for(int i=0;i<n;i++){
            ans[m-1]+=".";
        }
        return ans;
    }
}