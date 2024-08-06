class Solution {
    public int minimumPushes(String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : word.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        ArrayList<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());
        int ans = 0;
        for(int i = 1; i <= list.size(); i++){
            if(i <= 8){
                ans += list.get(i - 1);
            }
            if(i > 8 && i <= 16){
                ans += (list.get(i - 1) * 2);
            }
            if(i > 16 && i <= 24){
                ans += (list.get(i - 1) * 3);
            }
            if(i > 24){
                ans += (list.get(i - 1) * 4);
            }
        }       
        return ans;
    }
}