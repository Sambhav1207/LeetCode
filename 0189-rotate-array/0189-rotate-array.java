class Solution {
    public void rotate(int[] nums, int k) {
        //Brute Force
        k = nums.length - (k % nums.length);
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < k; i++){
            temp.add(nums[i]);
        }
        for(int i = k; i < nums.length; i++){
            nums[i - k] = nums[i];
        }
        for(int i = nums.length - k; i < nums.length; i++){
            nums[i] = temp.get(i - (nums.length - k));
        }
    }
}