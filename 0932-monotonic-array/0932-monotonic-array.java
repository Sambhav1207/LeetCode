class Solution {
    public boolean isMonotonic(int[] nums) {
        int flag = 0;
        if(isIncreasing(nums)){
            flag = 1;
        }else if(isDecreasing(nums)){
            flag = 1;
        }
        return (flag == 0 ? false : true);
    }
    private boolean isIncreasing(int[] nums){
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i + 1]){
                return false;
            }
        }
        return true;
    }
    private boolean isDecreasing(int[] nums){
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] < nums[i + 1]){
                return false;
            }
        }
        return true;
    }
}