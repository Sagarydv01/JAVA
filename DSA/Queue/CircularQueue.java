package DSA.Queue;

import java.util.Scanner;

public class CircularQueue {
    private static final int MAX = 5;
    private int[] queue = new int[MAX];
    private int front = -1;
    private int rear = -1;

    boolean enqueue(int item) {
        if ((rear + 1) % MAX == front) {
            return false; // Overflow
        }
        if (front == -1) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % MAX;
        }
        queue[rear] = item;
        return true;
    }

    boolean dequeue() {
        if (front == -1) {
            return false; // Underflow
        }
        System.out.println("Deleted: " + queue[front]);
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % MAX;
        }
        return true;
    }

    boolean display() {
        if (front == -1) {
            return false;
        }
        System.out.print("Queue: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) break;
            i = (i + 1) % MAX;
        }
        System.out.println();
        return true;
    }

    boolean peek() {
        if (front == -1) {
            return false;
        }
        System.out.println("Front element: " + queue[front]);
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularQueue q = new CircularQueue();

        while (true) {
            System.out.println("\nCircular Queue");
            System.out.println("1. Enqueue\n2. Dequeue\n3. Display\n4. Peek\n5. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element: ");
                    if (!q.enqueue(sc.nextInt()))
                        System.out.println("Queue Overflow");
                    break;
                case 2:
                    if (!q.dequeue())
                        System.out.println("Queue Underflow");
                    break;
                case 3:
                    if (!q.display())
                        System.out.println("Queue is Empty");
                    break;
                case 4:
                    if (!q.peek())
                        System.out.println("Queue is Empty");
                    break;
                case 5:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}

