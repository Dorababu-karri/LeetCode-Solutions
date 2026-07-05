class Solution {
    public int maxDigitRange(int[] nums) {
        int max=0;

        for(int i:nums){
            int r[]=digit(i);
            max=Math.max(max,r[1]-r[0]);
        }
        long sum=0;
        for(int i:nums){
            int r[]=digit(i);
            if(max==r[1]-r[0]){
                sum+=i;
            }
        }
        return (int)sum;
    }
    public int[] digit(int n){
        int min=9,max=0;
        while(n!=0){
            int dig=n%10;
            min=Math.min(dig,min);
            max=Math.max(dig,max);
            n/=10;
        }
        return new int[]{min,max};
    }
}