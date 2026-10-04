class Solution {
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    public int orangesRotting(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        Queue<int[]> queue=new LinkedList<>();
        int fresh=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==2) queue.add(new int[]{i,j});
                else if(grid[i][j]==1) fresh++;
            }
        }
        int minute=0;
        if(fresh==0) return minute;
        while(!queue.isEmpty()){
            int size=queue.size();
            while(size-->0){
                int i[]=queue.poll();
                for(int k=0;k<dx.length;k++){
                    if( (i[0]+dx[k]<r) && (i[0]+dx[k]>=0) && (i[1]+dy[k]<c) && (i[1]+dy[k]>=0) && grid[i[0]+dx[k]][i[1]+dy[k]]==1 ){
                        fresh--;
                        grid[i[0]+dx[k]][i[1]+dy[k]]=2;
                        queue.add(new int[]{i[0]+dx[k],i[1]+dy[k]});
                    } 
                }
            }
            minute++;
            if(fresh==0) return minute;
        }
        return (fresh!=0)?-1:minute;
    }
}