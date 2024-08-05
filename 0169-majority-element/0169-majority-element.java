class Solution {
    public int majorityElement(int[] nums) {
        //Brute Force
        // for(int i = 0; i < nums.length; i++){
        //     int count = 0;
        //     for(int j = 0; j < nums.length; j++){
        //         if(nums[j] == nums[i]){
        //             count++;
        //         }
        //     }
        //     if(count > nums.length / 2) return nums[i];
        // }

        //Better
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int num : nums){
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }
        // for(Map.Entry<Integer, Integer> it : map.entrySet()){
        //     if(it.getValue() > nums.length / 2){
        //         return it.getKey(); 
        //     }
        // }

        //Optimal: Moore's Voting Algorithm
        int n = nums.length, el = 0, count = 0;
        for(int i = 0; i < n; i++){
            if(count == 0){
                count = 1;
                el = nums[i];
            }else if(el == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        count = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == el){
                count++;
            }
        }
        if(count > (n / 2)) return el;
        return el;
    }
}