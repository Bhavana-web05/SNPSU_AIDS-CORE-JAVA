package com.DataStructure.Stack;

public class Stack {
    int[] arr;
    int top;
    int size;
    Stack(int size) {
        this.size=size;
        top =-1;
        arr=new int[size];
    }
    void push(int val) {
        if (top == size - 1) {
            System.out.println("Stack is overflow");
            return;
        }
        top++;
        arr[top] = val;
    }
        void pop(){
            if(top==-1){
            System.out.println("Stack is underflow");
            return;
            }
            arr[top]=0;
            top--;
        }
        int Top() {
            if (top == -1) {
                System.out.println("Stack is underflow");
                return -1;
            }
            return arr[top];
        }
        boolean isEmpty() {
        return  top == -1;
        }

    }

class Driver{
    public static void main(String[] args) {
        Stack st=new Stack(10);
        st.push(11);
        st.push(25);
        st.push(30);
        st.push(40);
        System.out.println(st.Top());
        st.push(50);
        st.pop();
        st.pop();
        st.pop();
        System.out.println(st.Top());

    }

}
