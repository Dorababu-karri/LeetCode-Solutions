class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] a) {
        Arrays.sort(a);
        int n=a.length;
        for(int i=0;i<n;i++){
            if(i==0){
                if(a[i]!=1) a[i]=1;
            }else{
                if(a[i]!=a[i-1] && a[i]!=a[i-1]+1){
                    a[i]=a[i-1]+1;
                }
            }
        }
        return a[n-1];
    }
}