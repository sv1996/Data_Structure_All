package MultiThreading.ProducerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerExample {

    int capacity;
    Queue<Integer> queue = new LinkedList<>();

    public ProducerConsumerExample(int capacity) {
        this.capacity = capacity;

    }

    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() == capacity) {
            wait(); // wait until there is space
        }

        queue.add(value);
        System.out.println("Produced: " + value);
        notifyAll(); // notify consumers that an item is available
    }



    // synchronised method for consuming items from the queue
    public synchronized int consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait(); // wait until there is an item to consume
        }

        int value = queue.poll();
        System.out.println("Consumed: " + value);
        notifyAll(); // notify producers that space is available
        return value;
    }

    public static void main(String[] args) {
        ProducerConsumerExample pc = new ProducerConsumerExample(5);

        // Producer thread
        Thread producerThread = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    pc.produce(i);
                    Thread.sleep(100); // simulate time taken to produce
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Consumer thread
        Thread consumerThread = new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    pc.consume();
                    Thread.sleep(150); // simulate time taken to consume
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producerThread.start();
        consumerThread.start();
    }

}