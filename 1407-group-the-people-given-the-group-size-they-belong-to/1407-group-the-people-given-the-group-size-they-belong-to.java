class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, List<Integer>> temp = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < groupSizes.length; i++){
            int size = groupSizes[i];
            temp.putIfAbsent(size, new ArrayList<>());
            temp.get(size).add(i);
            if(temp.get(size).size() == size){
                result.add(new ArrayList<>(temp.get(size)));
                temp.get(size).clear();
            }
        }
        return result;
    }
}