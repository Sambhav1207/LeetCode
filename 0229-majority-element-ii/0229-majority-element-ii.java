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
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > nums.length / 3){
                list.add(entry.getKey());
            }
            if(list.size() == 2){
                break;
            }
        }
        return list;
    }
}