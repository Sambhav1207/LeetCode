class Solution {
    public void rotate(int[][] matrix) {
        //Brute Force: Using another 2D Matrix
        // int n = matrix.length;
        // int ans[] = new int[n][n];
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < n; j++){
        //         ans[j][n - 1 - i] = matrix[i][j];
        //     }
        // }
        // matrix = ans;

        //Optimal
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                //int temp = 0;
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                //int temp = 0;
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }
}