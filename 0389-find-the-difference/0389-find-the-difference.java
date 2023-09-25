class Solution {
    public char findTheDifference(String s, String t) {
        /*
        int result = 0;
        for(int n : t.toCharArray()){
            result += n;
        }
        for(int n : s.toCharArray()){
            result -= n;
        }
        return (char) (result);
        */
        char result = 0;
        for(char c : s.toCharArray()){
            result ^= c;
        }
        for(char c : t.toCharArray()){
            result ^= c;
        }
        return result;
    }
}