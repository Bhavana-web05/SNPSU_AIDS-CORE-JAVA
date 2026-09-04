package com.DataStructure.DyanamicProgramming.Memoization;

import java.util.Arrays;

public class Fibonacci {
        static int fib(int n,int[]dp){
            //n==0 and n==1 given so it prints first 1 and 2
            if(n==0||n==1){
                return n;//base case
            }else {
                //check if answer exists are not
                if(dp[n]!=-1){
                    return dp[n];
                }
                //don't return first store it
               dp[n]= fib(n-1,dp)+fib(n-2,dp);
               return dp[n];
            }

        }

        public static void main(String[] args) {
            int n=100;
            //step1 -create dp array
            int[] dp = new int[n];
            Arrays.fill(dp,-1);
        /* we are using for loop here instead of direct soupt bcz a function can return only one value at a time
           so to get series we are using for loop
           this for loop is just to call that function multiple times
         */
            for (int i = 0; i < n ; i++) {
                System.out.print(fib(i,dp)+" ");

            }
        }
    }
