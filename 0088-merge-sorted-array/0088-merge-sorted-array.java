class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int gap=(n+m+1)/2;
        int len=n+m;
        while(gap>0){
            int left=0,right=gap;
            while(right<len){
                if(right<m && left<m){
                    if(nums1[right]<nums1[left]){
                        nums1[left]=nums1[left]^nums1[right];
                        nums1[right]=nums1[left]^nums1[right];
                        nums1[left]=nums1[left]^nums1[right];
                    }
                    left++;
                    right++;
                }
                else if(right>=m && left<m){
                    if(nums2[right-m]<nums1[left]){
                        nums1[left]=nums1[left]^nums2[right-m];
                        nums2[right-m]=nums1[left]^nums2[right-m];
                        nums1[left]=nums1[left]^nums2[right-m];
                    }
                    left++;
                    right++;
                }
                else if(right>=m && left>=m){
                    if(nums2[right-m]<nums2[left-m]){
                        nums2[left-m]=nums2[left-m]^nums2[right-m];
                        nums2[right-m]=nums2[left-m]^nums2[right-m];
                        nums2[left-m]=nums2[left-m]^nums2[right-m];
                    }
                    left++;
                    right++;
                }
            }
            if(gap==1) break;
            gap=(gap+1)/2;
        }
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        for(int i=m;i<len;i++) 
        {
            nums1[i]=nums2[i-m];
        }
    }
}