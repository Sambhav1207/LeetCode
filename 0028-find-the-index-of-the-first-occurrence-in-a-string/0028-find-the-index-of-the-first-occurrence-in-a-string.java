class Solution {
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        if(h < n){
            return -1;
        }
        for(int i = 0; i <= h - n; i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                boolean found = true;
                for(int j = 1; j < n; j++){
                    if(haystack.charAt(i + j) != needle.charAt(j)){
                        found = false;
                        break;
                    }
                }
                if(found){
                    return i;
                }
            }
        }
        return -1;
    }
}