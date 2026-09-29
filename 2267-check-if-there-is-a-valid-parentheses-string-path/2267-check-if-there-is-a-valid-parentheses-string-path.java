class Solution {
    static char[][] grid;
    static HashMap<String,Boolean> dp;
    static int r,c;
    public boolean hasValidPath(char[][] grid) {
        this.grid=grid;
        this.r=grid.length;
        this.c=grid[0].length;
        if(grid==null || grid[0][0]==')' || grid[r-1][c-1]=='(') return false;
        int len=r+c-1;
        if(len%2!=0) return false;
        dp=new HashMap<>();
        return helper(0,0,0);
    }
    public boolean helper(int i,int j,int help){
        if(i>=r || j>=c) return false;
        String key=i+" "+j+" "+help;
        if(grid[i][j]=='('){
            help=help+1;
        }else{
            help=help-1;
        }
        if(help<0 || help>(r+c)/2) return false;
        if(i==r-1 && j==c-1){
            return (help==0)?true:false;
        }
        if(dp.containsKey(key)) return dp.get(key);
        boolean up=helper(i+1,j,help);
        boolean left=false;
        if(!up)
            left=helper(i,j+1,help);
        boolean ans=up || left;
        dp.put(key,ans);
        return ans;
    }
}