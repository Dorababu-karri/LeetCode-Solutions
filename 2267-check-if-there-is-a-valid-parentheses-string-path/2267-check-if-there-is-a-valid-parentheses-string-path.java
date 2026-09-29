class Solution {
    static char[][] grid;
    static HashMap<String,Boolean> dp;
    static int r,c;
    public boolean hasValidPath(char[][] grid) {
        this.grid=grid;
        if(grid==null || grid[0][0]==')') return false;
        int r=grid.length;
        int c=grid[0].length;
        dp=new HashMap<>();
        return helper(r-1,c-1,0);
    }
    public boolean helper(int i,int j,int help){
        if(i<0 || j<0) return false;
        if(i==0 && j==0){
            if(grid[i][j]=='(') help=help+1;
            else help=help-1;
            return (help==0)?true:false;
        }
        if(help>0) return false;
        String key=i+" "+j+" "+help;
        if(dp.containsKey(key)) return dp.get(key);
        if(grid[i][j]=='('){
            help=help+1;
        }else{
            help=help-1;
        }
        boolean up=helper(i-1,j,help);
        boolean left=helper(i,j-1,help);
        boolean ans=up || left;
        dp.put(key,ans);
        return ans;
    }
}