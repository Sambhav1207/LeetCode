class Solution {
    public int longestValidParentheses(String s) {
        int maxLen = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // Initialize stack with -1 to handle edge cases

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(i); // Push the index of '('
            } else {
                stack.pop(); // Pop the last unmatched '(' index
                if (stack.isEmpty()) {
                    stack.push(i); // Push the current index as a new base
                } else {
                    // Calculate the length of the current valid substring
                    maxLen = Math.max(maxLen, i - stack.peek());
                }
            }
        }

        return maxLen;
    }
}