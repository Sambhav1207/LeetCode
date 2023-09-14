class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        int digits = 0;
        for(int num : nums){
            while(num > 0){
                num /= 10;
                digits++;
            }
            if(digits % 2 == 0){
                count++;
            }
            digits = 0;
        }
        return count;
    }
}