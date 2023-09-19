class Solution {
    public int uniquePaths(int m, int n) {
        int[] arr = new int[n]; 
        arr[0] = 1; 
        for (int i = 0; i < m; i++) { 
            for (int j = 1; j < n; j++) { 
                arr[j] += arr[j - 1]; 
            } 
        } 
        return arr[n - 1]; 
    }
}