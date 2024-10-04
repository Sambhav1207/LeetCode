class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n = skill.length;
        int totalSkill = skill[0] + skill[n - 1];
        long chemSum = 0;
        for(int i = 0; i < n / 2; i++){
            if(skill[i] + skill[n - i - 1] != totalSkill){
                return -1;
            }
            chemSum += (long) skill[i] * skill[n - i - 1];
        }
        return chemSum;
    }
}