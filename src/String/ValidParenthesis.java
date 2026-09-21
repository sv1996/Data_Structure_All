package String;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    //improved Solution
    private static boolean isValidImproved(String str) {

        Stack<Character> stk = new Stack<Character>();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) =='(')
            {
                stk.push(')');
            }
            else if(str.charAt(i) =='{')
            {
                stk.push('}');
            }
            else if(str.charAt(i) =='[')
            {
                stk.push(']');
            }
            else if(stk.isEmpty() || stk.pop() != str.charAt(i))
            {
                return false;
            }
        }
 return stk.isEmpty();


    }
    // second Solution
    private static boolean isMatched(char x1, char x2) {
       if(x1=='(' && x2 ==')')
       {
           return true;
       }
       else if(x1=='{'  && x2 == '}')
       {
           return true;
       }
       else if(x1=='['  && x2 == ']')
       {
           return true;
       }
       else
       {
           return false;
       }

    }
    private static boolean isValid(String str) {

        char[] ch = str.toCharArray();
        Stack<Character> stk = new Stack<Character>();
        for (int i = 0; i < ch.length; i++) {

            if (ch[i] == '(' || ch[i] == '[' || ch[i] == '{')
            {

                stk.push(ch[i]);

            }
            else if(ch[i] == ')' || ch[i] == ']' || ch[i] == '}')
            {
                if(stk.isEmpty())
                {
                    return false;
                }
                else if(isMatched(stk.pop(), ch[i] )==false)
                {
                    return false;
                }
            }
        }

        if(stk.isEmpty())
        {
            return true;
        }

        else {
            return false;
        }
    }



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string");
        String str=s.next();
        boolean ans = isValid( str);
         boolean ans1 = isValidImproved(str);
        if(ans1)
        {
            System.out.println("This String is balanced");
        }
         else
        {
            System.out.println("This String is Not balanced");
        }
    }
}
//    Stack<Character> stack = new Stack<>();
//	for (int i = 0; i < s.length(); i++) {
//        if (stack.empty() || s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
//        stack.push(s.charAt(i));
//        } else {
//        if (stack.peek() != '(' && s.charAt(i) == ')') {
//        return false;
//        } else if(stack.peek() != '[' && s.charAt(i) == ']') {
//        return false;
//        } else if(stack.peek() != '{' && s.charAt(i) == '}') {
//        return false;
//        } else {
//        stack.pop();
//        }
//        }
//        }
//        return stack.empty();
///////////////////////
//public boolean isValid(String s) {
//    Stack<Character> stack = new Stack<>();
//    Map<Character, Character> map = new HashMap<>();
//    map.put(')','(');
//    map.put('}','{');
//    map.put(']','[');
//
//    for(char c: s.toCharArray()){
//        if(map.containsKey(c)){
//            if(stack.isEmpty()) return false;
//            if(stack.pop() != map.get(c)) return false;
//        }else{
//            stack.push(c);
//        }
//    }
//    return stack.isEmpty() ? true : false ;
//}
////////////////////////////////////////////////////////////////////////////////////////////
//public boolean isValid(String s) {
//    Stack<Character> st = new Stack<Character>();
//
//    for(int i=0;i<s.length();i++){
//        char ch = s.charAt(i);
//        if(ch=='(' || ch=='{' || ch == '[')
//            st.push(ch);
//        else{
//            switch(ch){
//                case ')':
//                    if(st.isEmpty() || st.peek()!='(')
//                        return false;
//                    break;
//                case '}':
//                    if(st.isEmpty() || st.peek()!='{')
//                        return false;
//                    break;
//                case ']':
//                    if(st.isEmpty() || st.peek()!='[')
//                        return false;
//                    break;
//                default:
//                    return false;
//            }
//            st.pop();
//        }
//    }
//    if(!st.isEmpty())
//        return false;
//    return true;
//}