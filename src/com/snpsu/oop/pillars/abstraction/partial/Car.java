package com.snpsu.oop.pillars.abstraction.partial;

abstract class Car {
    abstract void start();

    void brake() {
        System.out.println("Car Stops");
    }
}
    class BMW extends Car {
        void start() {
            System.out.println("BMW start");
        }
}

    class Toyata extends Car {
        void start() {
            System.out.println("Toyata start");
        }
    }

    class Drivercode {
        public static void main(String[] args) {
        }
    }