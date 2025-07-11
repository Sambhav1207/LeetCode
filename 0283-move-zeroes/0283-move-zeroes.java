class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        //Brute Force
        // ArrayList<Integer> temp = new ArrayList<>();
        // for(int i = 0; i < n; i++){
        //     if(nums[i] != 0){
        //         temp.add(nums[i]);
        //     }
        // }
        // for(int i = 0; i < temp.size(); i++){
        //     nums[i] = temp.get(i);
        // }
        // for(int i = temp.size(); i < n; i++){
        //     nums[i] = 0;
        // }

        //Optimal
        int j = -1;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }
        if(j == -1) return;
        for(int i = j + 1; i < n; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}