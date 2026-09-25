class Solution {
    public long countIntersectingIntervals(int[][] intervals) {
        long count=0;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int n=intervals.length;
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        int j=0;
        for(int i[]:intervals) arr1[j++]=i[0];
        j=0;
        for(int i[]:intervals) arr2[j++]=i[1];
        
        for(int i=0;i<n;i++){
            int idx=Ceil(arr1,arr2[i]);
            count+=(idx-1-i);
            
        }
        return count;
    }
    public int Ceil(int a[],int k){
        int low=0,high=a.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(a[mid]<=k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
}