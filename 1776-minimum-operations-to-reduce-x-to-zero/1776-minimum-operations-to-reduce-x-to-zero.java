class Solution {
    public int minOperations(int[] nums, int x) {
        int target = -x, n = nums.length;
        for(int num : nums){
            target += num;
        }
        if(target == 0){
            return n;
        }
        int maxLength = 0, currentSum = 0, left = 0;
        for(int right = 0; right < n; right++){
            currentSum += nums[right];
            while(left <= right && currentSum > target){
                currentSum -= nums[left];
                left++;
            }
            if(currentSum == target){
                maxLength = Math.max(maxLength, right - left + 1);
            }
        }
        return maxLength != 0 ? n - maxLength : -1;
    }
}