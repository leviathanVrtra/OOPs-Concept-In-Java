package com.sachin.copy.deep;

/*
In Deep Copy,
The deep copy of an object will have an exact copy of all the fields of source object like a shallow copy,
but unlike sallow copy if the source object has any reference to object as fields, then a replica of the
object is created by calling clone method.
This means that both source and destination objects are independent of each other.
Any change made in the cloned object will not impact the source object.
 */

public class Main {
    public static void main(String[] args) {
        Department dept = new Department("1", "CSE", "Teacher");
        Employee emp = new Employee(1, "Sachin", dept);

        Employee emp2 = null;

        try {
            emp2 = (Employee) emp.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(emp.dept.getDesignation());

        emp2.dept.setDesignation("Professor");

        System.out.println(emp.dept.getDesignation());
    }
}