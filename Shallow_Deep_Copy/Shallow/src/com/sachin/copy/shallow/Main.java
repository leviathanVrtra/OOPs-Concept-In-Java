package com.sachin.copy.shallow;

/*
In Shallow Copy,
This object will have an exact copy of all the fields of source object including the primitive type
and object references. If the source object contains any references to other objects in field then
in the new instance will have only references to those objects, a copy of those objects is not created.
This means if we make changes in shallow copy then changes will get reflected in the source object.
Both instances are not independent.
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