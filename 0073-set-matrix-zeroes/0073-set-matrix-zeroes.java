class Solution {
    int temp = (int) 1e9 + 7;
    public void setZeroes(int[][] matrix) {
        //Brute Force
        int n = matrix.length;
        int m = matrix[0].length;
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < m; j++){
        //         if(matrix[i][j] == 0){
        //             markRow(matrix, n, m, i);
        //             markCol(matrix, n, m, j);
        //         }
        //     }
        // }
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < m; j++){
        //         if(matrix[i][j] == temp){
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }

        //Better
        // int row[] = new int[n];
        // int col[] = new int[m];
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < m; j++){
        //         if(matrix[i][j] == 0){
        //             row[i] = 1;
        //             col[j] = 1;
        //         }
        //     }
        // }
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < m; j++){
        //         if(row[i] == 1 || col[j] == 1){
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }

        //Optimal
        int col0 = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if(j != 0){
                        matrix[0][j] = 0;
                    }else{
                        col0 = 0;
                    }
                }
            }
        }
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(matrix[i][j] != 0){
                    if(matrix[i][0] == 0 || matrix[0][j] == 0){
                        matrix[i][j] = 0;
                    }
                }
            }
        }
        if(matrix[0][0] == 0){
            for(int j = 0; j < m; j++){
                matrix[0][j] = 0;
            }
        }
        if(col0 == 0){
            for(int i = 0; i < n; i++){
                matrix[i][0] = 0;
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