class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length, count = 0;
        //Brute Force
        // for(int i = 0; i < n; i++){
        //     for(int j = i; j < n; j++){
        //         int sum = 0;
        //         for(int m = i; m <= j; m++){
        //             sum += nums[m];
        //         }
        //         if(sum == k){
        //             count++;
        //         }
        //     }
        // }

        //Better
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += nums[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}