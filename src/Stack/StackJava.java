package  Stack;

import java.util.Stack;

class StackUsingArray{
     public int data[];
     public int top;

    public StackUsingArray()
    {

        data = new int [10];
        top=-1;
    }
    public StackUsingArray(int capacity)
    {
        data = new int [capacity];
        top=-1;
    }
    public int size(){
       return top+1;
    }
    public boolean isEmpty()
    {
        if(top==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void push(int element) throws StackFullException {
        if(size()==data.length){
            //stack full Exception
            throw new StackFullException( );
        }
        top++;
        data[top] =element;
    }

    public int top () throws StackEmptyException
    {
        if(size()==0)
        {
            throw new StackEmptyException( );
        }
        return data[top];
    }

    public int pop() throws StackEmptyException
    {
        if(size()==0)
        {
            throw new StackEmptyException( );
        }
        int temp = data[top];
        top--;
        return temp;
    }

}

public class StackJava {
    public static void main(String[] args) throws Exception {
 StackUsingArray stack = new StackUsingArray();
     for(int i=1;i<=5;i++)
    {
    stack.push(i);
     }
  while(!stack.isEmpty())
  {
    try
    {
        System.out.print(stack.pop()+"->");
    }
   catch (StackEmptyException e)
   {
       e.printStackTrace();
   }
}
    }
}
