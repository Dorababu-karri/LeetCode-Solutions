class Solution {
    static char[][] grid;
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    static int r,c;
    public int numIslands(char[][] grid) {
        this.grid=grid;
        this.r=grid.length;
        this.c=grid[0].length;
        int ans=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                   
                    dfs(i,j);
                    ans++;
                     
                }
            }
        }
         
        return ans;
    }
    public void dfs(int i,int j){
        grid[i][j]='0';
        for(int k=0;k<dx.length;k++){
            if( (i+dx[k]<r) && (i+dx[k]>=0) && (j+dy[k]<c) && (j+dy[k]>=0) && grid[i+dx[k]][j+dy[k]]=='1' ){
            
                dfs(i+dx[k],j+dy[k]);
            }
        }
    }
}