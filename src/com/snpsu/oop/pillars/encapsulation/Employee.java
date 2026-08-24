package com.snpsu.oop.pillars.encapsulation;

public class Employee {
    private String empName;
    private int empID;

    Employee(String empName, int empID) {//constructor
        this.empName = empName;
        this.empID = empID;
    }

    String getEmpName() {
        return empName;
    }

    int getEmpID() {
        return empID;
    }

    void setEmpName(String empName) {
        this.empName = empName;
    }

    void setEmpID(int empID) {
        this.empID = empID;
    }

    void printDetails() {
        System.out.println(empName + " " + this.empName);
        System.out.println(empID + " " + this.empID);
    }
}
    class DriverCode {
        public static void main(String[] args) {
            Employee emp1 = new Employee("John", 1);
            System.out.println (emp1.getEmpName());
            System.out.println (emp1.getEmpID());
            emp1.setEmpName("Jane");
            emp1.printDetails();
        }
    }

