class Solution {
    public int largestAltitude(int[] gain) {
        int al=0;
        int cural=0;
        int n=gain.length;
        for(int i=0;i<n;i++){
            cural=cural+gain[i];
            if(cural>al){
                al=cural;
            }
        }
        return al;
    }
}