class Solution {
    public int minDeletions(String s) {
        HashMap<Character, Integer> count = new HashMap<>();
        int deletions = 0;
        HashSet<Integer> frequency = new HashSet<>();
        for(char c : s.toCharArray()){
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        for(int freq : count.values()){
            while(freq > 0 && frequency.contains(freq)){
                freq--;
                deletions++;
            }
            frequency.add(freq);
        }
        return deletions;
    }
}