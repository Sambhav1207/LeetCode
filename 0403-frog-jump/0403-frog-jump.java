class Solution {
    public boolean canCross(int[] stones) {
        //Creating a new HashMap
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        //Adding all values of stones[] in map
        for(int i=0; i<stones.length; i++){
            map.put(stones[i], new HashSet<>());
        }
        //Mapping 0 to 1
        map.get(stones[0]).add(1);
        //Mapping every other stone's options and checking for last stone
        for(int i=0; i<stones.length; i++){
            int currStone = stones[i];
            HashSet<Integer> jumps = map.get(currStone);
            for(int jump : jumps){
                int position = currStone + jump;
                if(position == stones[stones.length-1]){
                    return true;
                }
                if(map.containsKey(position) == true){
                    if(jump - 1 > 0){
                        map.get(position).add(jump-1);
                    }
                    map.get(position).add(jump);
                    map.get(position).add(jump+1);                    
                }
            }
        }
        return false;
    }
}