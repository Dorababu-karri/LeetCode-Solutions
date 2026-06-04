class Solution {
    public boolean asteroidsDestroyed(int mass, int[] a) {
        Arrays.sort(a);
        long sum=mass;
        for(int i:a){
            if(sum>=i){
                sum+=i;
            }else{
                return false;
            }
        }
        return true;
    }
}