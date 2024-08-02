class Solution {
    public int removeDuplicates(int[] nums) {
        //Brute Force
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        List<Integer> list = new ArrayList<Integer>(set);
        Collections.sort(list);
        int index = 0;
        for(int num : list){
            nums[index] = num;
            index++;
        }
        return list.size();
    }
}