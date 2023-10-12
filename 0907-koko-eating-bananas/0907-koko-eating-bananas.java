class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = maxElement(piles);
        while(low <= high){
            int mid = low + (high - low) / 2;
            long total = totalHours(piles, mid);
            if(total <= h){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
    public int maxElement(int[] piles){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < piles.length; i++){
            max = Math.max(max, piles[i]);
        }
        return max;
    }
    public long totalHours(int[] piles, int hours){
        long total = 0;
        for(int i = 0; i < piles.length; i++){
            total += (piles[i] + hours - 1) / hours;
        }
        return total;
    }
}