class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums){
        /*
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int i = 0, j, size = 0, len = 0;
        for(List<Integer> list : nums){
            j = 0;
            for(int n : list){
                List<Integer> l = map.getOrDefault(i + j, new ArrayList<Integer>());
                l.add(0, n);
                map.put(i + j, l);
                size = Math.max(size, i + j);
                len++;
                j++;
            }
            i++;
        }
        int arr[] = new int[len];
        for(i = j = 0; i <= size; i++){
            for(int n : map.get(i)){
                arr[j++] = n;
            }
        }
        return arr;
        */
        Map<Integer, List<Integer>> map = new HashMap<>();
        int n = nums.size();
        for(int i = n - 1; i >= 0; i--){
            for(int j = 0; j < nums.get(i).size(); j++){
                map.putIfAbsent(i + j, new ArrayList<Integer>());
                map.get(i + j).add(nums.get(i).get(j));
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        int len = map.size();
        for(int i = 0; i < len; i++){
            result.addAll(map.get(i));
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}