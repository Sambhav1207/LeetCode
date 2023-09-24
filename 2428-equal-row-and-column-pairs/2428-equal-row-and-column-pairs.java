class Solution {
    public int equalPairs(int[][] grid) {
        int res = 0, n = grid.length;
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for(int i = 0; i < n; i++){
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for(int j = 0; j < n; j++){
                sb1.append(grid[i][j]);
                sb2.append(grid[j][i]);
                sb1.append(',');
                sb2.append(',');
            }
            String curr1 = sb1.toString();
            String curr2 = sb2.toString();
            map1.put(curr1, map1.getOrDefault(curr1, 0) + 1);
            map2.put(curr2, map2.getOrDefault(curr2, 0) + 1);
        }
        for(String str : map1.keySet()){
            if(map2.containsKey(str)){
                res += map1.get(str)*map2.get(str);
            }
        }
        return res;
    }
}