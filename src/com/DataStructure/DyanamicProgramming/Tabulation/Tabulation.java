package com.DataStructure.DyanamicProgramming.Tabulation;

public class Tabulation {
    public static void main(String[] args) {
        int n=100;
        //step 1
        int[]dp=new int[n];
        //step 2
        dp[0]=0;
        dp[1]=1;
        //step 3
        for (int i = 2; i <n; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.println("Fibonacci");
        for (int i = 1; i <n; i++) {
            System.out.print(dp[i]+" ");

        }


    }


}
