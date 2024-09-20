class Solution {
    public String shortestPalindrome(String s) {
        String str = new StringBuilder(s).reverse().toString();
        for(int i = 0; i < str.length(); i++){
            if(s.startsWith(str.substring(i))){
                return str.substring(0, i) + s;
            }
        }
        return str + s;
    }
}