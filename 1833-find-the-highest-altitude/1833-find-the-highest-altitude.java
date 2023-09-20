class Solution {
    public int largestAltitude(int[] gain) {
        /*
        int[] arr = new int[gain.length + 1];
        arr[0] = 0;
        for(int i = 0; i < gain.length; i++){
            arr[i + 1] = arr[i] + gain[i];
        }
        Arrays.sort(arr);
        return arr[gain.length];
        */
        int currentAlt = 0, maxAlt = 0;
        for(int i = 0; i < gain.length; i++){
            currentAlt += gain[i];
            maxAlt = Math.max(currentAlt, maxAlt);
        }
        return maxAlt;
    }
}