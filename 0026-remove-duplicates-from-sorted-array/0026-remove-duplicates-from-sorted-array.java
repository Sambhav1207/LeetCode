class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int k = set.size(), j = 0;
        for(int x : list){
            nums[j++] = x;
        }
        return k;
    }
}