package com.recursion;

public class SumofN {
    static int sum(int n){
        // after coming here it reads n which is 6 is 6==1
        // not true so goes to else and execute and continues until 1==1 and stops recursion
        if(n==1){
            return 1;//base case
        }else {
            return n+sum(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(sum(6));
        // first main function run it reads sum and its value in soupt and goes to function
    }
}
