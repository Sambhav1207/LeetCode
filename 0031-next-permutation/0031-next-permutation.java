class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1;
        //Finding the Break Point
        for(int i = n - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                ind = i;
                break;
            }
        }
        if(ind == -1){
            reverse(nums, 0, n - 1);
            return;
        }
        //Finding the next greater number
        for(int i = n - 1; i >= ind; i--){
            if(nums[i] > nums[ind]){
                int temp = nums[i];
                nums[i] = nums[ind];
                nums[ind] = temp;
                break;
            }
        }
        //Sorting the remaining
        reverse(nums, ind + 1, n - 1);
    }
    private void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}