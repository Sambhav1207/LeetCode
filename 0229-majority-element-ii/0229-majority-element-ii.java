class Solution {
    public List<Integer> majorityElement(int[] nums) {
        //Brute Force
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(list.size() == 0 || list.get(0) != nums[i]){
                int count = 0;
                for(int j = 0; j < nums.length; j++){
                    if(nums[j] == nums[i]){
                        count++;
                    }
                }
                if(count > nums.length / 3){
                    list.add(nums[i]);
                }
            }
            if(list.size() == 2){
                break;
            }
        }
        return list;
    }
}