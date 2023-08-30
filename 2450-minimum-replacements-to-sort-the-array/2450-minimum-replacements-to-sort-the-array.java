class Solution {
    public long minimumReplacement(int[] nums) {
        int currentLargest = nums[nums.length - 1];
        long totalReplacements = 0;
        
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] <= currentLargest) {
                currentLargest = nums[i];
                continue;
            }

            int n;
            if (nums[i] % currentLargest != 0) {
                n = nums[i] / currentLargest + 1;
                currentLargest = nums[i] / n;
            } else {
                n = nums[i] / currentLargest;
            }
            
            totalReplacements += n - 1;
        }
        
        return totalReplacements;        
    }
}