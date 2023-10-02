class Solution {
    public boolean winnerOfGame(String colors) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 0); 
        map.put('B', 0);
        for(int i = 0; i < colors.length(); i++){
            char c = colors.charAt(i);
            int count = 0;
            while(i < colors.length() && colors.charAt(i) == c){
                i++;
                count++;
            }
            map.put(c, map.get(c) + Math.max(count - 2, 0));
            i--;
        } 
        return map.get('A') > map.get('B');
    }
}