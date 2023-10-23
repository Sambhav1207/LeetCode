class Solution {
    public boolean isPowerOfFour(int n) {        
        if(n <= 0){
            return false;
        }
        if(n == 1){
            return true;
        }
        /*
        if(n % 4 == 0){
            return isPowerOfFour(n / 4);
        }
        return false;
        */
        double logBase4 = Math.log(n) / Math.log(4);
        return logBase4 == (int)logBase4;
    }
}