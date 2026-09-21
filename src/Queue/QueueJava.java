package  Queue;

import java.util.LinkedList;
import java.util.Queue;

class QueueUsingArray
{
    //rear
    //front
   //1-enqueue()
   //2-dequeue()
   //3-peek()
    public int data[];
    public int front,rear,size;
    QueueUsingArray()
    {
        data = new int [10];
        front =-1;
        rear =-1;
        size=0;
    }
  //  if user gives capacity
    QueueUsingArray(int capacity)
    {
        data = new int [capacity];
        front =-1;
        rear =-1;
        size=0;
    }
    //size of Queue
    public int size()
    {
        return size;
    }

    //checking Queue is Empty is not
    public Boolean isEmpty()
    {
        return (size()==0);
    }
    // creating Front

  public int front() throws QueueEmptyException {
        if(size()==0)
        {
            throw new QueueEmptyException();
        }
        return data[front];
  }
    // Enqueue for pushing an Element

public void  enqueue(int element) throws QueueFullException {
    if(size == data.length)
    {
        throw new QueueFullException();
    }
    if(size==0)
    {
        front =0;
    }
    size++;
    rear++;
    if(rear== data.length)
    {
        rear =0;
    }
    data[rear] = element;
}
// for Dequeue[might throw EmptyException]

    public int dequeue () throws QueueEmptyException
    {
        if(size==0)
        {
            throw new QueueEmptyException();

        }
        int temp = data[front];
        front++;
        if(front== data.length){
            front=0;

        }
        size--;
        return temp;
    }

}

public class QueueJava {
    public static void main(String[] args) {
QueueUsingArray  queue =  new QueueUsingArray ();
        for (int i = 1; i <=5; i++) {
            try
            {
                queue.enqueue(i);
            }
            catch (QueueFullException e)
            {
                e.printStackTrace();
            }
        }
while(!queue.isEmpty())
{
    try
    {
        System.out.print(queue.dequeue());
    }
    catch (QueueEmptyException e)
    {
        e.printStackTrace();

    }
}

    }

}
