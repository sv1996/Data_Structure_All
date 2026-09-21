package  Stack;

import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,45,656,6,6,7,8};
        Stack<Integer> stack = new Stack<Integer> ();
        for(int i=0;i<arr.length;i++)
        {
            stack.push(i);
        }

        System.out.println("Peek Element is->"+ stack.peek());
        System.out.println("Peek Element is->"+ stack.isEmpty());
        System.out.println(stack.empty());
//        while(!stack.isEmpty())
//        {
//            System.out.print(stack.pop()+" ");
//        }
    }
}
