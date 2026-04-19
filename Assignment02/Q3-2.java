package com;
import java.util.Scanner;

class StackLL {
    static class Node {
        int data;
        Node next;
        Node(int val) {
            data = val;
            next = null;
        }
    }

    private Node top;

    public StackLL() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int val) {
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed: " + val);
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Popped: " + top.data);
        top = top.next;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top: " + top.data);
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node trav = top;
        while (trav != null) {
            System.out.print(trav.data + " -> ");
            trav = trav.next;
        }
        System.out.println("null");
    }
}