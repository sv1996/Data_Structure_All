package Stack;

import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String str = "[()()]{}";
        // this str is balanced parenthesis because every opening parenthesis has a corresponding closing parenthesis in the correct order
        if (isParenthesisBalanced(str)) {
            System.out.println("Balanced Parenthesis");
        } else {
            System.out.println("Not Balanced Parenthesis");
        }
    }

    private static boolean isParenthesisBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                stack.push(str.charAt(i));
            } else if (str.charAt(i) == ')' || str.charAt(i) == '}' || str.charAt(i) == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if ((str.charAt(i) == ')' && top != '(') || (str.charAt(i) == ']' && top != '[') || (str.charAt(i) == '}' && top != '{')) {

                    return false;
                }
                stack.pop();
            }
        }
        // If stack is empty at the end, then all parentheses are balanced
        return stack.isEmpty();
    }
}
