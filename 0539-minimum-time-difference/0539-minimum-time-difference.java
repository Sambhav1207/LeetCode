class Solution {
    public int findMinDifference(List<String> timePoints) {
        Set<String> duplicate = new HashSet<>();
        List<Integer> minutes = new ArrayList<>();
        for(String time : timePoints){
            if(duplicate.contains(time)){
                return 0;
            }
            duplicate.add(time);
            String[] splitTime = time.split(":");
            int totalMinutes = Integer.parseInt(splitTime[0]) * 60 + Integer.parseInt(splitTime[1]);
            minutes.add(totalMinutes);
        }
        Collections.sort(minutes);
        int result = 24 * 60 - minutes.get(minutes.size() - 1) + minutes.get(0);
        for(int i = 1; i < minutes.size(); i++){
            result = Math.min(result, minutes.get(i) - minutes.get(i - 1));
        }
        return result;
    }
}