class Solution {
    int temp = (int) 1e9 + 7;
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    markRow(matrix, n, m, i);
                    markCol(matrix, n, m, j);
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == temp){
                    matrix[i][j] = 0;
                }
            }
        }
    }
    private void markRow(int[][] matrix, int n, int m, int i){
        for(int j = 0; j < m; j++){
            if(matrix[i][j] != 0){
                matrix[i][j] = temp;
            }
        }
    }
    private void markCol(int[][] matrix, int n, int m, int j){
        for(int i = 0; i < n; i++){
            if(matrix[i][j] != 0){
                matrix[i][j] = temp;
            }
        }
    }
}