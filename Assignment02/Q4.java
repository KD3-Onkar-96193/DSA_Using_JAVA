package com;
import java.util.Scanner;

class CircularLL {
    static class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    private Node tail;

    public CircularLL() {
        tail = null;
    }

    public boolean isEmpty() {
        return tail == null;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node trav = tail.next;
        do {
            System.out.print(trav.data + " -> ");
            trav = trav.next;
        } while (trav != tail.next);

        System.out.println("(head)");
    }

    public void addAtPos(int val, int pos) {
        Node newNode = new Node(val);

        if (isEmpty()) {
            if (pos != 1) {
                System.out.println("Invalid position");
                return;
            }
            tail = newNode;
            tail.next = tail;
            return;
        }

        if (pos == 1) {
            newNode.next = tail.next;
            tail.next = newNode;
            return;
        }

        Node trav = tail.next;
        for (int i = 1; i < pos - 1; i++) {
            trav = trav.next;
            if (trav == tail.next) {
                System.out.println("Invalid position");
                return;
            }
        }

        newNode.next = trav.next;
        trav.next = newNode;

        if (trav == tail) {
            tail = newNode;
        }
    }

    public void deleteAtPos(int pos) {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        if (tail.next == tail) {
            if (pos != 1) {
                System.out.println("Invalid position");
                return;
            }
            tail = null;
            return;
        }

        if (pos == 1) {
            tail.next = tail.next.next;
            return;
        }

        Node trav = tail.next;
        for (int i = 1; i < pos - 1; i++) {
            trav = trav.next;
            if (trav.next == tail.next) {
                System.out.println("Invalid position");
                return;
            }
        }

        Node temp = trav.next;
        trav.next = temp.next;

        if (temp == tail) {
            tail = trav;
        }
    }
}