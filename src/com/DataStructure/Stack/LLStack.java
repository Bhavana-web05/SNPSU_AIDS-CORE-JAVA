package com.DataStructure.Stack;

public class LLStack {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top; // Equivalent to head of Linked List
    private int size;

    public LLStack() {
        this.top = null;
        this.size = 0;
    }

    // Push: Insert at head
    public void push(int val) {
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
        size++;
        System.out.println("Pushed: " + val);
    }

    // Pop: Remove from head
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        int poppedValue = top.data;
        top = top.next;
        size--;
        return poppedValue;
    }

    // Peek: View top element without removing
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return top.data;
    }

    // Check if empty
    public boolean isEmpty() {
        return top == null;
    }

    // Get current size
    public int getSize() {
        return size;
    }

    // Print stack contents
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        System.out.print("Stack (Top -> Bottom): ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LLStack stack = new LLStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display(); // 30 -> 20 -> 10 -> null

        System.out.println("Top element: " + stack.peek()); // 30
        System.out.println("Popped element: " + stack.pop()); // 30

        stack.display(); // 20 -> 10 -> null
    }
}
