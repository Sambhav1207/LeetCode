class Solution {
    Map<Integer, List<Integer>> map = new HashMap<>();
    public int[] restoreArray(int[][] adjacentPairs) {
        for(int[] edge : adjacentPairs){
            int x = edge[0];
            int y = edge[1];
            if(!map.containsKey(x)){
                map.put(x, new ArrayList());
            }
            if(!map.containsKey(y)){
                map.put(y, new ArrayList());
            }
            map.get(x).add(y);
            map.get(y).add(x);
        }
        int root = 0;
        for(int num : map.keySet()){
            if(map.get(num).size() == 1){
                root = num;
                break;
            }
        }
        int[] ans = new int[map.size()];
        dfs(root, Integer.MAX_VALUE, ans, 0);
        return ans;
    }
    private void dfs(int node, int prev, int[] ans, int i){
        ans[i] = node;
        for(int neighbor : map.get(node)){
            if(neighbor != prev){
                dfs(neighbor, node, ans, i + 1);
            }
        }
    }
}