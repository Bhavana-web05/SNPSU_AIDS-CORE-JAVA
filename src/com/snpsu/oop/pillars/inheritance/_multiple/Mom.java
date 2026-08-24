package com.snpsu.oop.pillars.inheritance._multiple;

public interface Mom {
    void cook();
}
 interface Dad{
    void cook();
}
class Child implements Mom,Dad{
    public void cook(){
        System.out.println("Child cooked");
    }
}

