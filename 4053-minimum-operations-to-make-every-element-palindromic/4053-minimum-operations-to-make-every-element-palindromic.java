class Solution {
    public static List<Long> odd;
    public static List<Long> even;
    static{
        List<Long> all=new ArrayList<>();
        for(int i=1;i<=99999;i++){
            String s=Integer.toString(i);
            //odd length
            StringBuilder rev=new StringBuilder(s.substring(0,s.length()-1));
            rev.reverse();
            long val1=Long.parseLong(s+rev.toString());
            if(val1<=2000000000L) all.add(val1);
            //Even Length
            rev=new StringBuilder(s.substring(0,s.length()));
            rev.reverse();
            long val2=Long.parseLong(s+rev.toString());
            if(val2<=2000000000L) all.add(val2);
        }
        Collections.sort(all);
        odd=new ArrayList<>();
        even=new ArrayList<>();
        for(long num:all){
            if(num%2==0) even.add(num);
            else odd.add(num);
        }
    }
    public long minOperations(int[] nums) {
      
        long ans=0;
        for(int i:nums){
            List<Long> target=(i%2!=0)?odd:even;
            int idx=Collections.binarySearch(target,(long)i);
           if (idx >= 0) continue; // Already a palindrome

            idx = -idx - 1;
            long minDiff = Long.MAX_VALUE;

            // Check adjacent elements in target
            if (idx < target.size()) {
                minDiff = Math.min(minDiff, Math.abs(target.get(idx) - i));
            }
            if (idx - 1 >= 0) {
                minDiff = Math.min(minDiff, Math.abs(target.get(idx - 1) - i));
            }

            ans += minDiff / 2;
        }
        return ans;
    }
}