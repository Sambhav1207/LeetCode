class Solution {
    public String intToRoman(int num) {
        String roman = "";
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanLetters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        for(int i = 0; i < values.length; i++){
            while(num >= values[i]){
                roman += romanLetters[i];
                num -= values[i];
            }
        }
        return roman;
    }
}