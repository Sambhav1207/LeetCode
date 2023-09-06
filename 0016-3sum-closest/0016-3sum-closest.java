class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2]; //Initializing closestSum
        for(int i = 0; i < nums.length - 2; i++){
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k]; //All possibilities
                if(compare(target, sum, closestSum)){
                    closestSum = sum;
                }
                if(sum < target){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return closestSum;
    }

    private boolean compare(int target, int sum, int closestSum){
        return Math.abs(target - sum) < Math.abs(target - closestSum);
    }
}