class Solution {
    public String removeDigit(String number, char digit) {
        List<String> digits = new ArrayList<>();
        for(int i = 0; i < number.length(); i++){
            if(number.charAt(i) == digit){
                String str = number.substring(0, i) + number.substring(i + 1);
                digits.add(str);
            }
        }
        Collections.sort(digits);
        return digits.get(digits.size() - 1);
    }
}