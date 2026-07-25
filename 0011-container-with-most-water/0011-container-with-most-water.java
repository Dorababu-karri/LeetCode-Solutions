class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
         int p1=0,p2=n-1;
         int maxarea=0;
        while(p1<p2){
            int carea=(p2-p1)*Math.min(height[p1],height[p2]);
            maxarea=Math.max(carea,maxarea);
            if(height[p1]<height[p2])
                p1++;   
            else
                p2--;
        }
        return maxarea;
    }
}