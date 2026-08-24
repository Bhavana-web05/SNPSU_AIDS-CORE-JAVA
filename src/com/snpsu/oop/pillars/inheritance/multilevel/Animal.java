package com.snpsu.oop.pillars.inheritance.multilevel;
public  class Animal{
    void eat(){
        System.out.println("eat");
    }
}
class Cat extends Animal{ //this is the child class
    void meow(){
        System.out.println("meow");
    }
}
class Kitten extends Cat{
    void cry(){
        System.out.println("cry");
    }
}
class DriveCode{
    public static void main(String[] args) {
        Animal a=new Animal();
        Cat c=new Cat();
        Kitten k=new Kitten();

        a.eat(); //this class has only eat option

        c.meow(); //this class has both meow and eat
        c.eat();

        //u cant put here c.cry bcz it is a feature of child k and c is parent it creates error A

        k.meow(); //this class has meow,cry and eat
        k.cry();
        k.eat();
    }
}

