class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Brute Force
        // int ans[] = new int[2];
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i + 1; j < nums.length; j++){
        //         //if(i == j) continue;
        //         if(nums[i] + nums[j] == target){
        //             ans[0] = i;
        //             ans[1] = j;
        //         }
        //     }
        // }
        // return ans;

        //Better and Optimal for Index Questions
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans[] = new int[]{-1, -1};
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int needed = target - num;
            if(map.containsKey(needed)){
                ans[0] = map.get(needed);
                ans[1] = i;
            }
            map.put(nums[i], i);
        }
        return ans;
    }
}