class Solution {
    int n;
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        this.n=n;
        for(int i=0;i<n;i++){
            int k=rowShift[i];
            if(k>0){
            reverser(grid,0,k-1,i);
            reverser(grid,0,n-1,i);
            reverser(grid,0,n-k-1,i);
            }
        }

        for(int i=0;i<n;i++){
            int k=colShift[i];
            if(k>0){
            reversec(grid,0,k-1,i);
            reversec(grid,0,n-1,i);
            reversec(grid,0,n-k-1,i);
            }
        }
        return grid;
    }
    public void reverser(int[][] grid,int st,int en,int i){
         while(st<en){
             int temp=grid[i][st];
             grid[i][st]=grid[i][en];
             grid[i][en]=temp;
             st++;
             en--;
         }
    }
    public void reversec(int[][] grid,int st,int en,int i){
         while(st<en){
             int temp=grid[st][i];
             grid[st][i]=grid[en][i];
             grid[en][i]=temp;
             st++;
             en--;
         }
    }
}