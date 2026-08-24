package com.training.basic.iteration;

public class Fibonacci {
    public static void main(String[] args) {
        int n=10,sum=0,n1=0,n2=1;
        System.out.println(n1+""+n2+"");
        //we took i=2 bcz we have already printed 0 and 1 so
        for(int i=2;i<n;i++){
            sum=n1+n2;
            System.out.print(sum + " ");
            n1=n2;
            n2=sum;
        }
    }
}

