class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<Integer>());
        ans.add(new ArrayList<Integer>());
        for(int n : nums1){
            set1.add(n);
        }
        for(int n : nums2){
            set2.add(n);
        }
        for(int n : set1){
            if(!set2.contains(n)){
                ans.get(0).add(n);
            }
        }
        for(int n : set2){
            if(!set1.contains(n)){
                ans.get(1).add(n);
            }
        }
        return ans;
    }
}