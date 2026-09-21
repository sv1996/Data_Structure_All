package Stack;

class StackUsingArray {
    int[] data;
    int top;

    public StackUsingArray() {
        data = new int[10];
        // taken 10 as default size of stack
        top = -1;
        // top is -1 because stack is empty
    }

    public StackUsingArray(int[] data, int top) {
        this.data = data;
        this.top = top;
    }

    public StackUsingArray(int capacity) {
        data = new int[capacity];
        top = -1;
    }

    // methods
    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int element) {
        if (size() == data.length) {
            // stack full exception
            System.out.println("Stack is full");
            return;
        }

        top++;
        data[top] = element;

    }

    public int top() {
        if (size() == 0) {
            // stack empty exception
            System.out.println("Stack is empty");
            return -1;
        }

        return data[top];
    }


    public int pop() {
        int temp = data[top];
        top--;
        return temp;
    }
}

public class StackUsingArrayImpl {
    public static void main(String[] args) {
        // creating  stack of capacity 5
        StackUsingArray stack = new StackUsingArray(5);
        for (int i = 1; i <= 5; i++) {
            stack.push(i);

        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }


}
