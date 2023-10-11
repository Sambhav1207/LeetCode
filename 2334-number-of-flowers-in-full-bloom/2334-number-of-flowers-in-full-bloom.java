class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        TreeMap<Integer, Integer> tmap = new TreeMap<>();
        for(int[] t : flowers){
            tmap.put(t[0], tmap.getOrDefault(t[0], 0) + 1);
            tmap.put(t[1] + 1, tmap.getOrDefault(t[1] + 1, 0) - 1);
        }
        int sum = 0;
        for(int t : tmap.keySet()){
            sum += tmap.get(t);
            tmap.put(t, sum);
        }
        int[] res = new int[people.length];
        for(int i = 0; i < people.length; i++){
            Integer val = tmap.floorKey(people[i]);
            if(val != null){
                res[i] = tmap.get(val);
            }
        }
        return res;
    }
}