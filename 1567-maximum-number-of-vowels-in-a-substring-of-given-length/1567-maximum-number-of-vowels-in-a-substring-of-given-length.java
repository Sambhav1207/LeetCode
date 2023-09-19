class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int ans = 0;
        int val = 0;
        int i = 0;
        while(i < k){
            if(isVowel(s.charAt(i))){
                val++;
            }
            i++;
        }
        ans = val;
        while(i < n){
            if(isVowel(s.charAt(i))){
                val++;
            }
            if(isVowel(s.charAt(i - k))){
                val--;
            }
            ans = Math.max(ans, val);
            i++;
        }
        return ans;
    }
    public boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }
}