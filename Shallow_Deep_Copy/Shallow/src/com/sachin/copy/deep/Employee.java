package com.sachin.copy.deep;

public class Employee implements Cloneable{
    private int id;
    private String name;
    Department dept;

    public Employee(int id, String name, Department dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee emp = (Employee) super.clone();
        emp.dept = (Department) dept.clone();

        return emp;
    }
}
