class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr1[] = Arrays.copyOfRange(nums, 0, n);
        int arr2[] = Arrays.copyOfRange(nums, n, 2 * n);
        int ans[] = new int[2 * n];
        int j = 0, k = 0;
        for(int i = 0; i < 2 * n; i++){
            if(i % 2 == 0){
                ans[i] = arr1[j];
                j++;
            }else{
                ans[i] = arr2[k];
                k++;
            }
        }
        return ans;
    }
}