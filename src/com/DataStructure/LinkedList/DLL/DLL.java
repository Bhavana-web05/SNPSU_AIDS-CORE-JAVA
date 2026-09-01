package com.DataStructure.LinkedList.DLL;
class Node {
    int data;

    Node prev;   // Points to the previous node
    Node next;   // Points to the next node

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}


public class DLL {

    Node head;   // Head points to the first node

    DLL() {
        head = null;
    }


    // Insert at Head
    void insertAtHead(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;  // New node points to old head
        head.prev = newNode;  // Old head points back to new node
        head = newNode;       // Head becomes new node
    }


    // Insert at Tail
    void insertAtTail(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;  // Last node points to new node
        newNode.prev = temp;  // New node points back to last node
    }


    // Get Size
    int getSize() {

        int size = 0;

        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            size++;
        }

        return size;
    }


    // Insert at Index
    void insertAtIndex(int data, int index) {

        int size = getSize();

        if (index < 0 || index > size) {
            System.out.println("INVALID INDEX");
            return;
        }

        // Insert at beginning
        if (index == 0) {
            insertAtHead(data);
            return;
        }

        Node newNode = new Node(data);

        Node temp = head;

        // Move temp to the node before the required index
        while (--index > 0) {
            temp = temp.next;
        }

        // Connect new node with next node
        newNode.next = temp.next;

        // Connect new node with previous node
        newNode.prev = temp;

        // If new node is not inserted at tail,
        // update the next node's prev
        if (temp.next != null) {
            temp.next.prev = newNode;
        }

        // Connect previous node with new node
        temp.next = newNode;
    }


    // Delete at Head
    void deleteAtHead() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;

        // If list is not empty,
        // the new head should not have a previous node
        if (head != null) {
            head.prev = null;
        }
    }


    // Print from Head to Tail
    void printDLL() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println("Null");
    }
}


/**
 *
 */
class Driver {

    public static void main(String[] args) {

        DLL dll = new DLL();

        dll.insertAtHead(1);
        dll.insertAtHead(5);
        dll.insertAtHead(2);
        dll.insertAtHead(8);

        dll.printDLL();

        dll.insertAtTail(7);
        dll.printDLL();

        dll.insertAtIndex(9, 3);
        dll.printDLL();

        dll.deleteAtHead();
        dll.printDLL();
    }
}
