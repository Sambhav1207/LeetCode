class Solution {
    public int bestClosingTime(String customers) {
        int maxPenalty = 0;
        int penalty = 0;
        int bestHour = -1;
        for(int i = 0; i < customers.length(); i++){
            if(customers.charAt(i) == 'Y'){
                penalty += 1;
            }else{
                penalty += -1;
            }
            if(penalty > maxPenalty){
                maxPenalty = penalty;
                bestHour = i;
            }
        }
        return bestHour+1;
    }
}