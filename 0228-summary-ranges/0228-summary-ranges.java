class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> list = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return list;
        }
        int start = 0, end = 0, n = nums.length, i = 0;
        while(i < n){
            if(i + 1 < n && nums[i + 1] - nums[i] == 1){
                end++;
            }else{
                if(start == end){
                    list.add(String.valueOf(nums[end]));
                }else{
                    list.add(nums[start] + "->" + nums[end]);
                }
                end++;
                start = end;
            }
            i++;
        }
        return list;
    }
}