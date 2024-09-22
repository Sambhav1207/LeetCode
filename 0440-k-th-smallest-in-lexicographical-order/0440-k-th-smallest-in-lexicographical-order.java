//Took Help
class Solution {
    public int findKthNumber(int n, int k) {
        int curr = 1;
        --k;
        while(k > 0){
            long steps = countSteps(curr, n);
            if(steps <= k){
                curr++;
                k -= steps;
            }else{
                curr *= 10;
                k--;
            }
        }
        return curr;
    }
    private long countSteps(long p, long n){
        long steps = 0;
        for(long f = p, l = p; f <= n; f *= 10, l = l * 10 + 9){
            steps += Math.min(n + 1, l + 1) - f;
        }
        return steps;
    }
}