class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        Set<String> set = new HashSet<>();
        for(String word : dictionary){
            set.add(word);
        }
        int[] arr = new int[s.length() + 1];
        for(int i = 0; i <= s.length(); i++){
            arr[i] = s.length();
        }
        arr[0] = 0;
        for(int i = 1; i <= s.length(); i++){
            arr[i] = arr[i - 1] + 1;
            for(int j = 0; j < i; j++){
                if(set.contains(s.substring(j, i))){
                    arr[i] = Math.min(arr[i], arr[j]);
                }
            }
        }
        return arr[s.length()];
    }
}