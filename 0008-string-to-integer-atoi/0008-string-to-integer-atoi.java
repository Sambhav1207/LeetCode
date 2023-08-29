class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();

        //Skipping blank spaces at the beginning
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        int positive = 0;
        int negative = 0;
        if (i<n && s.charAt(i) == '+') {
            positive++; // number of positive signs at the start in string
            i++;
        }
        if (i<n && s.charAt(i) == '-') {
            negative++; // number of negative signs at the start in string
            i++;
        }

        double ans = 0;

        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            ans = ans * 10 + (s.charAt(i) - '0'); // (s.charAt(i) - '0') converts string to int according to StackOverflow
            i++;
        }

        if (negative > 0) {
            ans = -ans;
        }
        if (positive > 0 && negative > 0) { 
            return 0;
        }

        int INT_MAX = (int) Math.pow(2, 31) ;
        int INT_MIN = (int) Math.pow(-2, 31);
        if (ans > INT_MAX) { // if ans > 2^31 - 1
            ans = INT_MAX;
        }
        if (ans < INT_MIN) { // if ans < -2^31
            ans = INT_MIN;
        }

        return (int) ans;
    }
}