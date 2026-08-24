package com.snpsu.oop.pillars.polymorphism.compile;

public class Addition {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b,int c) {
        return a + b+c;
    }
}
//overloading
class Drivercode {
    public static void main(String[] args) {
        Addition obj = new Addition();
        System.out.println(obj.add(1,2));
        System.out.println(obj.add(1,2,3));

    }
}

