class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int N = m + n;
        int arr[] = new int[N];
        for(int i=0; i<m; i++){
            arr[i]=nums1[i];
        }
        for(int i=m, j=0; i<m+n; i++){
            arr[i]=nums2[j];
            j++;
        }
        double median=0.0;
        Arrays.sort(arr);
        if(arr.length%2==0){
            int mid=N/2-1;
            median=(double)(arr[mid]+arr[mid+1])/2;
        }
        else{
           int mid=(N+1)/2;
            median=arr[mid-1];
        }
        return median;
    }
}