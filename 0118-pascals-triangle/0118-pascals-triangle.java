class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int row = 1; row <= numRows; row++){
            ans.add(generateRow(row));
        }
        return ans;
    }
    private List<Integer> generateRow(int row){
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);
        for(int col = 1; col < row; col++){
            ans *= (row - col);
            ans /= col;
            ansRow.add((int) ans);
        }
        return ansRow;
    }
}