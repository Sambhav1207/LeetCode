class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int left = 0;
        for(int n : nums){
            sum += n;
        }
        for(int i = 0; i < nums.length; i++){
            if(left * 2 == sum - nums[i]){
                return i;
            }
            left += nums[i];
        }
        return -1;
    }
}