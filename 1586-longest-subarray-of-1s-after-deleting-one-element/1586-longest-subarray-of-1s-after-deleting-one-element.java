class Solution {
    public int longestSubarray(int[] nums) {
        int current = 0, prev = 0;
        int ans = 0;
        for(int n : nums){
            if(n == 1){
                current++;
            }else{
                ans = Math.max(ans, current + prev);
                prev = current;
                current = 0;
            }
        }
        ans = Math.max(ans, current + prev);
        if(ans == nums.length){
            return ans - 1;
        }
        return ans;
    }
}