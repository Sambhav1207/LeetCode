class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '*'){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        while(!stack.empty()){
            sb.append(stack.peek());
            stack.pop();
        }
        sb.reverse();
        return sb.toString();
    }
}