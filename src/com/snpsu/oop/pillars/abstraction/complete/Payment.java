package com.snpsu.oop.pillars.abstraction.complete;

public interface Payment {
    void pay();
    default void refund(){
        System.out.println("Refund");
    }
}
class UPI implements Payment{
    public void pay(){
        System.out.println("UPI Pay");
    }
}
class Creditcard implements Payment{
    public void pay(){
        System.out.println("Credit card Pay");
    }
    public void refund(){//can overwrite the default function
        System.out.println("Credit card Refund");
    }
}
class Cash implements Payment {
    public void pay() {
        System.out.println("Cash Pay");
    }
}
class Drivercode{
    public static void main(String[] args) {
        Payment p= new UPI();
         p.pay();
    }
}
