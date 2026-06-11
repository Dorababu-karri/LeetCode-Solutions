class Solution {
    int md;
    int mod=1_000_000_007;
    public int assignEdgeWeights(int[][] edges) {
        List<List<Integer>> tree=new ArrayList<>();
        for(int i=0;i<=edges.length;i++) tree.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0]-1;
            int v=edges[i][1]-1;
            tree.get(u).add(v);
            tree.get(v).add(u);
        }
        md=-1;
        DFS(tree,0,-1,0);
        return pow(2,md-1);
    }
    public void DFS(List<List<Integer>> tree,int src,int parent,int depth){
        md=Math.max(md,depth);
        for(int node:tree.get(src)){
            if(node!=parent)
                DFS(tree,node,src,depth+1);
        }
    }
    public int pow(int base,int b){
        long res=1;
        long a=base;
        while(b>0){
            if((b&1)==1) {
                res=(res*a)%mod;
            }
            a=(a*a)%mod;
            b>>=1;
        }
        return (int)res;
    }
}