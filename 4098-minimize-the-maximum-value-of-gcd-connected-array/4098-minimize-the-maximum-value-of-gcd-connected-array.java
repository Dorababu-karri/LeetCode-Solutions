class Solution {
    public long minimumMaxValue(int n, int index, int value) {
        int d=getLeastFactor(value);
        int t=n-index-1;
        
        if(value==1 || 2*index-1>=value-d) return -1;
        if(index==n-1) return value;
        long ans=(long)(value+d)+(long)2*(t-1);
        return ans;
    }
    public int getLeastFactor(int val){
        if(val%2==0) return 2;
        for(int i=3;i*i<=val;i+=2){
            if(val%i==0) return i;
        }
        return val;
    }
}