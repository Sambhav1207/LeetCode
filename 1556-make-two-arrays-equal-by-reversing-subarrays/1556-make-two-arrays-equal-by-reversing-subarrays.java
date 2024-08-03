class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(target.length != arr.length) return false;
        Map<Integer, Integer> mapTarget = new HashMap<>();   
        Map<Integer, Integer> mapArr = new HashMap<>();
        for(int i = 0; i < target.length; i++){
            mapTarget.put(target[i], mapTarget.getOrDefault(target[i], 0) + 1);
        }   
        for(int i = 0; i < arr.length; i++){
            mapArr.put(arr[i], mapArr.getOrDefault(arr[i], 0) + 1);
        }   
        if(mapTarget.equals(mapArr)) return true;
        return false;
    }
}