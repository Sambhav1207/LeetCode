class Solution {
    public double myPow(double x, int n) {
        return Math.pow(x, n);
        /*
        if(n < 0){
            return helper(1 / x, Math.abs((long) n));
        }else{
            return helper(x, n);
        }
        */
    }
    /*
    private double helper(double x, long n){
        if(n == 0){
            return 1.0;
        }
        if(x == 0){
            return 0.0;
        }
        if(n % 2 == 0){
            return helper(x * x, n / 2);
        }else{
            return x * helper(x, n - 1);
        }
    }
    */
}