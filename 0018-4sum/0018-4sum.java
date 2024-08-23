class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        //Brute Force
        Set<List<Integer>> set = new HashSet<>();
        // for(int i = 0; i < n; i++){
        //     for(int j = i + 1; j < n; j++){
        //         for(int k = j + 1; k < n; k++){
        //             for(int l = k + 1; l < n; l++){
        //                 long sum = (long) nums[i] + nums[j];
        //                 sum += nums[k];
        //                 sum += nums[l];
        //                 if(sum == target){
        //                     List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
        //                     Collections.sort(temp);
        //                     set.add(temp);
        //                 }
        //             }
        //         }
        //     }
        // }

        //Better
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                Set<Long> st = new HashSet<>();
                for(int k = j + 1; k < n; k++){
                    long sum = nums[i] + nums[j];
                    sum += nums[k];
                    long fourth = target - sum;
                    if(st.contains(fourth)){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add((int) fourth);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                    st.add((long) nums[k]);
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;
    }
}