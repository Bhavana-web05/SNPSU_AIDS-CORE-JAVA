package com.snpsu.oop.pillars.polymorphism.Runtime;

public class Mom {
    void cook(){
        System.out.println("Indian");
    }
}
class Daughter extends Mom{
    void cook(){
        System.out.println("Chinese");
    }
}
//override
class Drivercode{
    public static void main(String[] args) {
        Mom m=new Mom();
        Daughter d=new Daughter();
        m.cook();
        d.cook();
    }
}
