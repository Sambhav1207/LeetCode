class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < allowed.length(); i++){
            set.add(allowed.charAt(i));
        }
        int count = 0;
        for(String word : words){
            int flag = 1;
            for(int i = 0; i < word.length(); i++){
                if(!set.contains(word.charAt(i))){
                    flag = 0;
                    break;
                }
            }
            count += flag;
        }
        return count;
    }
}