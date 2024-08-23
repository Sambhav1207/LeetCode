class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Brute Force
        // Set<List<Integer>> set = new HashSet<>();
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i + 1; j < nums.length; j++){
        //         for(int k = j + 1; k < nums.length; k++){
        //             if(nums[i] + nums[j] + nums[k] == 0){
        //                 List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
        //                 Collections.sort(list);
        //                 set.add(list);
        //             }
        //         }
        //     }
        // }

        //Better
        // for(int i = 0; i < nums.length; i++){
        //     Set<Integer> st = new HashSet<>();
        //     for(int j = i + 1; j < nums.length; j++){
        //         int third = -(nums[i] + nums[j]);
        //         if(st.contains(third)){
        //             List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
        //             temp.sort(null);
        //             set.add(temp);
        //         }
        //         st.add(nums[j]);
        //     }
        // }

        //Optimal
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i != 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1, k = nums.length - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0) j++;
                else if(sum > 0) k--;
                else{
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j - 1]) j++;
                    while(j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }
        return ans;
    }
}