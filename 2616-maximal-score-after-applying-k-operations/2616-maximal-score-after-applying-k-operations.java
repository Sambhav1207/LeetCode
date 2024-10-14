class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Long> maxHeap = new PriorityQueue<>((a, b) -> Long.compare(b, a));
        for(int num : nums){
            maxHeap.add((long) num);
        }
        long score = 0;
        for(int i = 0; i < k; i++){
            long maxVal = maxHeap.poll();
            score += maxVal;
            maxHeap.add((maxVal + 2) / 3);
        }
        return score;
    }
}