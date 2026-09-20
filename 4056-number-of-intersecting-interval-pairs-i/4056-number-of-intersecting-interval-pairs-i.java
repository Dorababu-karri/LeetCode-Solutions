class Solution {
    public int countIntersectingIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int count=0;
        int n=intervals.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int val[]=intervals[i];
                int val1[]=intervals[j];
                if(val1[0]<=val[1]) count++;
            }
        }
        return count;
    }
}