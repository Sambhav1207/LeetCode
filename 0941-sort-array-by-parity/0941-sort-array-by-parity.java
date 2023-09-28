class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int j = 0;
        int k = nums.length - 1;
        int result[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                result[j] = nums[i];
                j++;
            }else{
                result[k] = nums[i];
                k--; 
            }
        }
        return result;
    }
}