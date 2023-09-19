class Solution {
    public String reverseWords(String s) {
        if(s == null){
            return s;
        }
        /*
        String[] str = s.trim().split("\\s+");
        String out = "";
        for(int i = str.length - 1; i > 0; i--){
            out += str[i] + " ";
        }
        return out + str[0];
        */
        String words[] = s.trim().split("\\s+");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }
}