class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length, res = n, need = 0, curr = 0;
        for(int num : nums){
            need = (need + num) % p;
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i = 0; i < n; i++){
            curr = (curr + nums[i]) % p;
            map.put(curr, i);
            int needed = (curr - need + p) % p;
            res = Math.min(res, i - map.getOrDefault(needed, -n));
        }
        return res < n ? res : -1;
    }
}