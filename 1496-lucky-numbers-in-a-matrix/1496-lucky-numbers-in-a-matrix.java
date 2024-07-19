class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        List<Integer> rowMin = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int rMin = Integer.MAX_VALUE;
            for(int j = 0; j < m; j++){
                rMin = Math.min(rMin, matrix[i][j]);
            }
            rowMin.add(rMin);
        }
        List<Integer> colMax = new ArrayList<>();
        for(int i = 0; i < m; i++){
            int cMax = Integer.MIN_VALUE;
            for(int j = 0; j < n; j++){
                cMax = Math.max(cMax, matrix[j][i]);
            }
            colMax.add(cMax);
        }
        List<Integer> luckyNumbers = new ArrayList<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == rowMin.get(i) && matrix[i][j] == colMax.get(j)){
                    luckyNumbers.add(matrix[i][j]);
                }
            }
        }
        return luckyNumbers;
    }
}