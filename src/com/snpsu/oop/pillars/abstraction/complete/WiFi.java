package com.snpsu.oop.pillars.abstraction.complete;

public interface WiFi {//in interface use implement key
    void connect();
}
class Laptop implements WiFi {
    public void connect(){ // in interface manually need to make public
        System.out.println("Laptop connected to WiFi");
    }
}
class Phone implements WiFi {
    public void connect(){
        System.out.println("Phone connected to WiFi");
    }
}
