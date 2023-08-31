class Solution {
    public int minTaps(int n, int[] ranges) {
        int min = 0;
        int max = 0;
        int open = 0;
        int index = 0; //for optimization
        while(max < n){
            for(int i = index; i < ranges.length; i++){
                if(i - ranges[i] <= min && i + ranges[i] > max){
                    max = i + ranges[i];
                    index = i;
                }
            }
            if(min == max){
                return -1;
            }
            open++;
            min = max;
        }
        return open;
    }
}