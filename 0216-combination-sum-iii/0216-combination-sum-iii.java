class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, k, n, new ArrayList<>(), result);
        return result;
    }
    private void backtrack(int start, int k, int n, List<Integer> curr, List<List<Integer>> result){
        if(n == 0 && k == 0){
            result.add(new ArrayList<>(curr));
            return;
        }
        if(k == 0){
            return;
        }
        for(int i = start; i < 10; i++){
            curr.add(i);
            backtrack(i + 1, k - 1, n - i, curr, result);
            curr.remove(curr.size() - 1);
        }
    }
}