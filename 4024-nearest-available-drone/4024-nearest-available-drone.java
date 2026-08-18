class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int n=drones.length;
        int max=Integer.MAX_VALUE;
        int idx=-1;
        for(int i=0;i<n;i++){
            int dist=Math.abs(drones[i][0]-target[0])+Math.abs(drones[i][1]-target[1]);
            if(dist<=drones[i][2]){
                if(dist<max){
                    idx=i;
                    max=dist;
                }
            }
        }
        return idx;
    }
}