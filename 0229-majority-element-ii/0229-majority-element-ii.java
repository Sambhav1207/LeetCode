class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        //Brute Force
        // for(int i = 0; i < nums.length; i++){
        //     if(list.size() == 0 || list.get(0) != nums[i]){
        //         int count = 0;
        //         for(int j = 0; j < nums.length; j++){
        //             if(nums[j] == nums[i]){
        //                 count++;
        //             }
        //         }
        //         if(count > nums.length / 3){
        //             list.add(nums[i]);
        //         }
        //     }
        //     if(list.size() == 2){
        //         break;
        //     }
        // }

        //Better
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int i = 0; i < nums.length; i++){
        //     map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        // }
        // for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        //     if(entry.getValue() > nums.length / 3){
        //         list.add(entry.getKey());
        //     }
        //     if(list.size() == 2){
        //         break;
        //     }
        // }
        // int min = (int) (nums.length / 3) + 1;
        // for(int i = 0; i < nums.length; i++){
        //     map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        //     if(map.get(nums[i]) == min){
        //         list.add(nums[i]);
        //     }
        //     if(list.size() == 2){
        //         break;
        //     }
        // }

        //Optimal
        int count1 = 0, count2 = 0;
        int el1 = Integer.MIN_VALUE, el2 = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(count1 == 0 && nums[i] != el2){
                count1 = 1;
                el1 = nums[i];
            }else if(count2 == 0 && nums[i] != el1){
                count2 = 1;
                el2 = nums[i];
            }
            else if(el1 == nums[i]) count1++;
            else if(el2 == nums[i]) count2++;
            else{
                count1--;
                count2--;
            }
        }
        count1 = 0; 
        count2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == el1) count1++;
            if(nums[i] == el2) count2++;
        }
        int min = (int) (nums.length / 3) + 1;
        if(count1 >= min) list.add(el1);
        if(count2 >= min) list.add(el2);
        return list;
    }
}