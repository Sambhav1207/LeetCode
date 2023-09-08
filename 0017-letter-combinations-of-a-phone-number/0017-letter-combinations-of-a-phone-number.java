class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.length() == 0){
            return result;
        }
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        backtrack(digits, 0, new StringBuilder(), result, map);
        return result;
    }
    private void backtrack(String digits, int index, StringBuilder sb, List<String> result, Map<Character, String> map){
        if(index == digits.length()){
            result.add(sb.toString());
            return;
        }
        String letters = map.get(digits.charAt(index));
        for(char letter : letters.toCharArray()){
            sb.append(letter);
            backtrack(digits, index + 1, sb, result, map);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}