class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int n=intervals.length;
        int st=intervals[0][0];
        int prev=intervals[0][1];
        List<int[]> l=new ArrayList<>();
        for(int i=1;i<n;i++){
            if(prev<intervals[i][0]){
                l.add(new int[]{st,prev});
                st=intervals[i][0];
            }
            prev=Math.max(prev,intervals[i][1]);

        }
        l.add(new int[]{st,prev});
        int ans[][]=new int[l.size()][2];
        // int i=0;
        // for(List<Integer> l1:l){
        //     ans[i][0]=l1.get(0);
        //     ans[i++][1]=l1.get(1);
        // }
        return l.toArray(new int[0][]);
    }
}