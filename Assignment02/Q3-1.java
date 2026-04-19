package com;
class QueueLL {
    static class Node {
        int data;
        Node next;
        Node(int val) {
            data = val;
            next = null;
        }
    }

    private Node front, rear;

    public QueueLL() {
        front = rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int val) {
        Node newNode = new Node(val);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println("Enqueued: " + val);
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Dequeued: " + front.data);
        front = front.next;

        if (front == null)
            rear = null;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Front: " + front.data);
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        Node trav = front;
        while (trav != null) {
            System.out.print(trav.data + " -> ");
            trav = trav.next;
        }
        System.out.println("null");
    }
}