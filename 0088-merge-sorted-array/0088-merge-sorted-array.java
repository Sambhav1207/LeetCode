class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int i = 0, j = 0;
        // List<Integer> union = new ArrayList<>();
        // while(i < m && j < n){
        //     if(nums1[i] <= nums2[j]){
        //         if(union.size() == 0 || union.get(union.size() - 1) != nums1[i]){
        //             union.add(nums1[i]);
        //         }
        //         i++;
        //     }else{
        //         if(union.size() == 0 || union.get(union.size() - 1) != nums2[j]){
        //             union.add(nums2[j]);
        //         }
        //         j++;
        //     }
        // }
        // while(i < m){
        //     if(union.get(union.size() - 1) != nums1[i]){
        //         union.add(nums1[i]);
        //     }
        //     i++;
        // }
        // while(j < n){
        //     if(union.get(union.size() - 1) != nums2[j]){
        //         union.add(nums2[j]);
        //     }
        //     j++;
        // }
        
        for(int j = 0, i = m; j < n; j++){
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
}