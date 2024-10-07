class Solution {
    public int minLength(String s) {
        char[] stack = new char[s.length() + 1];
        int top = 0;
        for(char c : s.toCharArray()){
            if(top == 0){
                stack[top++] = c;
                continue;
            }
            if(c == 'B' && stack[top - 1] == 'A'){
                top--;
            }else if(c == 'D' && stack[top - 1] == 'C'){
                top--;
            }else{
                stack[top++] = c;
            }
        }
        return top;
    }
}