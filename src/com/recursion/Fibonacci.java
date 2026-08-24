package com.recursion;
public class Fibonacci {
        static int fib(int n){
            //n==0 and n==1 given so it prints first 1 and 2
            if(n==0||n==1){
                return n;//base case
            }else {
                return fib(n-1)+fib(n-2);
            }

        }

        public static void main(String[] args) {
            int n=10;
        /* we are using for loop here instead of direct soupt bcz a function can return only one value at a time
           so to get series we are using for loop
           this for loop is just to call that function multiple times
         */
            for (int i = 0; i < n ; i++) {
                System.out.print(fib(i)+" ");

            }
        }
    }

