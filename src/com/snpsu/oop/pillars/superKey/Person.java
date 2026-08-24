package com.snpsu.oop.pillars.superKey;
public class Person{
    String FName;
    String LName;
    Person(String FName, String LName){
        this.FName = FName;
        this.LName = LName;
    }
}
class Student extends Person{
    int rollNo;
    Student(String FName, String LName,int rollNo){
        super(FName, LName);
    this.rollNo = rollNo;
    }
}
class Drivercode{
    public static void main(String[] args){
        Student S1=new Student("David","Smith",1);
        Student S2 =new Student("Ashok","Ckara",2);
        System.out.println(S1.rollNo+" "+S1.FName+""+S1.LName);
        System.out.println(S2.rollNo+" "+S2.FName+""+S2.LName);
    }
}
