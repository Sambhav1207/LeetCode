class Solution {
    public int missingNumber(int[] nums) {
        // int[] hash = new int[nums.length + 1];
        // for(int i = 0; i < nums.length; i++){
        //     hash[nums[i]]++;
        // }
        // for(int i = 0; i < hash.length; i++){
        //     if(hash[i] == 0){
        //         return i;
        //     }
        // }
        // return -1;

        //Optimal 1
        int n = nums.length;
        // int sum = (n * (n + 1)) / 2;
        // int s2 = 0;
        // for(int i = 0; i < n; i++){
        //     s2 += nums[i];
        // }
        // return (sum - s2);

        //Optimal 2
        int xor1 = 0, xor2 = 0;
        for(int i = 0; i < n; i++){
            xor2 ^= nums[i];
            xor1 ^= (i + 1);
        }
        return (xor1 ^ xor2);
    }
}