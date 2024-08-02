class Solution {
    public int removeDuplicates(int[] nums) {
        //Brute Force
        // HashSet<Integer> set = new HashSet<>();
        // for(int i = 0; i < nums.length; i++){
        //     set.add(nums[i]);
        // }
        // List<Integer> list = new ArrayList<Integer>(set);
        // Collections.sort(list);
        // int index = 0;
        // for(int num : list){
        //     nums[index] = num;
        //     index++;
        // }
        // return list.size();

        //Optimal Solution
        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[j] != nums[i]){
                nums[i + 1] = nums[j];
                i++;
            }
        }
        return i + 1;
    }
}