class Solution {
    public int singleNumber(int[] nums) {
        //Brute Force
        // for(int i = 0; i < nums.length; i++){
        //     int num = nums[i], count = 0;
        //     for(int j = 0; j < nums.length; j++){
        //         if(nums[j] == num){
        //             count++;
        //         }
        //     }
        //     if(count == 1) return num;
        // }
        // return -1;

        //Optimal
        int xor = 0;
        for(int num : nums){
            xor ^= num;
        }        
        return xor;
    }
}