package DSA.Queue;

import java.util.Scanner;

public class LinearQueue {
    private static final int MAX = 5;
    private int[] queue = new int[MAX];
    private int front = -1;
    private int rear = -1;

    boolean enqueue(int item) {
        if (rear == MAX - 1) {
            return false; // Overflow
        }
        if (front == -1) {
            front = 0;
        }
        rear++;
        queue[rear] = item;
        return true;
    }

    boolean dequeue() {
        if (front == -1) {
            return false; // Underflow
        }
        System.out.println("Deleted: " + queue[front]);
        front++;
        if (front > rear) {
            front = rear = -1;
        }
        return true;
    }

    boolean display() {
        if (front == -1) {
            return false;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
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
        LinearQueue q = new LinearQueue();

        while (true) {
            System.out.println("\nLinear Queue");
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
