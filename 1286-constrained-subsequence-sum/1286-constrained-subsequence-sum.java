class Solution {
    public int constrainedSubsetSum(int[] nums, int k) {
        /* "BRUTE FORCE"
        int n = nums.length;
        int[] dp = new int[n];
        for(int i = 0; i < n; i++){
            dp[i] = nums[i];
            int maxOffset = i - k;
            for(int j = i - 1; j >= 0 && j >= maxOffset; j--){
                dp[i] = Math.max(dp[i], nums[i] + dp[j]);
            }
        }
        return Arrays.stream(dp).max().getAsInt();
        */
        int n = nums.length;
        int[] dp = new int[n];
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        for(int i = 0; i < n; i++){
            dp[i] = Math.max(nums[i], nums[i] + (dq.isEmpty() ? 0 : dq.peekFirst()));
            while(!dq.isEmpty() && dq.peekLast() < dp[i]){
                dq.pollLast();
            }
            dq.add(dp[i]);
            if(i >= k && dp[i - k] == dq.peekFirst()){
                dq.pollFirst();
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}