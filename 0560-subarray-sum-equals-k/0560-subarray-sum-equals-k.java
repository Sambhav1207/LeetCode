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
        // for(int i = 0; i < n; i++){
        //     int sum = 0;
        //     for(int j = i; j < n; j++){
        //         sum += nums[j];
        //         if(sum == k){
        //             count++;
        //         }
        //     }
        // }

        //Optimal
        HashMap<Integer, Integer> map = new HashMap<>();
        int preSum = 0;
        map.put(0, 1);
        for(int i = 0; i < n; i++){
            preSum += nums[i];
            int remove = preSum - k;
            count += map.getOrDefault(remove, 0);
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return count;
    }
}