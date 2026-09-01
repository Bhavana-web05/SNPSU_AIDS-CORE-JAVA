package com.Strings;

public class StringDemo1 {
    public static void main(String[] args) {
        String s1="Aaaa";
        String s2="Aaaa";
        String s3=new String("Aaaa");
        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//false
    }
}
