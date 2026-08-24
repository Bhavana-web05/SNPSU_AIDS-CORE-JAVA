package com.snpsu.oop.pillars.inheritance.Hierrachiary;

public class Animal {
    void eat(){
        System.out.println("Animal is eating");

    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Animal is barking");
    }
}
class Cat extends Animal {
    void meow(){
        System.out.println("Animal is meowing");
    }
}class DriveCode{
    public static void main(String[] args) {
        Animal a = new Animal();
        Cat c = new Cat();
        Dog d = new Dog();

        a.eat();

        c.meow();
        c.eat();

        d.bark();
        d.eat();
    }
}

