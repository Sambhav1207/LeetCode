class Solution {
    private static final int MOD = 1000000007;
    public int numFactoredBinaryTrees(int[] arr) {
        Arrays.sort(arr);
        Set<Integer> uniqueNumbers = new HashSet<>();
        for(int num : arr){
            uniqueNumbers.add(num);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, 1);
        }
        for(int i : arr){
            for(int j : arr){
                if(j > Math.sqrt(i)){
                    break;
                }
                if(i % j == 0 && uniqueNumbers.contains(i / j)){
                    long product = (long) map.get(j) * map.get(i / j);
                    map.put(i, (int) ((map.get(i) + (i / j == j ? product : product * 2)) % MOD));
                }
            }
        }
        int result = 0;
        for(int value : map.values()){
            result = (result + value) % MOD;
        }
        return result;
    }
}