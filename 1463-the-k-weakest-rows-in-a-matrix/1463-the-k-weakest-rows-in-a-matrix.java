class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] index = new int[mat.length];
        int[] soldiers = new int[mat.length];
        int[] kweak = new int[k];
        for(int i = 0; i < mat.length; i++){
            int count = 0;
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] == 1){
                    count ++;
                }
            }
            index[i] = i;
            soldiers[i] = count;
        }
        for(int i = 0; i < soldiers.length - 1; i++){
            for(int j = 0; j < (soldiers.length - 1 - i); j++){
                if(soldiers[j] > soldiers[j + 1]){
                    int n = soldiers[j];
                    soldiers[j] = soldiers[j + 1];
                    soldiers[j + 1] = n;
                    int m = index[j];
                    index[j] = index[j + 1];
                    index[j + 1] = m;
                }
            }
        }
        for(int i = 0; i < k; i++){
            kweak[i] = index[i];
        }
        return kweak;
    }
}