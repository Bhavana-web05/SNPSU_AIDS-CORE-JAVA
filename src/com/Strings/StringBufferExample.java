package com.Strings;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuilder sbf=new StringBuilder("Hello");//builder replace with buffer then it is buffer programm both works same .
        sbf.append("World");
        System.out.println(sbf.toString());
        sbf.reverse();
        System.out.println(sbf.toString());
        sbf.insert(4,"A" );
        System.out.println(sbf.toString());
        sbf.replace(5,6,"A");
        System.out.println(sbf.toString());

    }
}
