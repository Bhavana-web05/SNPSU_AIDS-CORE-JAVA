package com.DataStructure.LinkedList.SLL;

class Node{
    int data;
    Node next;           // Here we are using Node datatype for next attribute bcz the next points to the node
    // we are telling next to point to Node type of datatype only ,,, Node is a class
    Node(int data){  // In this constructor call we are not writing Node bcz we dont know the memory of the data as it will be asked in main if written
        this.data=data;
        this.next=null;
    }
}

public class SLL {
    Node head; //Head will point towards node so its data type is node
    SLL(){       //This is a default constructor here we are taking head has null ;l
        head=null;
    }

    void insertAtHead(int data){
        Node newNode=new Node(data);
        newNode.next=head; //making newnode take the value of the memory address in head
        head=newNode;      // making head take newnode memory address as its new value
    }

    void insertAtTail(int data){
        Node newNode=new Node(data); // create node
        if(head==null){          // this runs onlu if there is no linked list i.e head is null
            head=newNode;
            return ;
        }
        Node temp=head; //saying temp to start from head
        while(temp.next!=null){ // temp u run until u find null and stop
            temp=temp.next;     // temp take the value of next
        }
        temp.next=newNode;
    }

    int getSize(){
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        return size;
    }

    void insertAtIndex(int data,int index){
        int size=getSize();
        if(index==0 ||  index>size){
            System.out.println("INVALID INDEX");;
        }
        else if(index==0){
            insertAtHead(data);
        }
        else {
            Node newNode=new Node(data);
            Node temp=head;
            while (--index>0){
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
    }

    void deleteAtHead() {
        if (head == null) {
            System.out.println("INVALID INDEX");
            return;
        }
        Node toDelete = head;
        head = head.next;
        toDelete.next = null;
    }
    void deleteByValue(int val){
           if(head==null) {
               System.out.println("LinkedList is empty");
               return;
           }
           if(head.data==val){
               deleteAtHead();
               return;
           }
           Node temp=head;
           while(temp.next!=null){
               temp=temp.next;
        }
           if(temp.next==head){
               System.out.println("Value is not found");
               return;
           }
           Node toDelete=temp.next;
           temp.next=temp.next.next;
           toDelete=null;
    }
    void printSLL(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println("Null"); // to show this is the last element
    }
}

class Driver {
    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.insertAtHead(1);
        sll.insertAtHead(5);
        sll.insertAtHead(2);
        sll.insertAtHead(8);
        sll.printSLL();

        sll.insertAtTail(7);
        sll.printSLL();

        sll.insertAtIndex(9, 3);
        sll.printSLL();

        sll.deleteAtHead();
        sll.printSLL();
    }
}
