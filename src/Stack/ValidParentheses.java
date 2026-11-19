package Stack;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValidParenthese(String s) {
        char p ;
        if(s.length() < 2) {
            return false;
        }
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i ++) {

            p = '0';
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
                continue;
            }
            if(!stack.isEmpty()) {
                p = stack.pop();
                if ((c == ')' && p == '('
                        || c == ']' && p == '['
                        || c == '}' && p == '{')) {
                    continue;
                }
            }

            return false;
        }
        if(stack.isEmpty()) {
            return true;
        }
        return false;

    }
}
