package com.sachin.association.composition;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;

/*
HAS-A relationship
College has students
All the students are to be part of the class, no student can exist independently
 */

public class College {
    private String name;
    List<Student>students;

    public College(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStudents() {
        Student sv = new Student("Sachin");
        Student sn = new Student("Sonu");
        Student hs = new Student("Harish");

        List<Student> students1 = new ArrayList<Student>();
        students1.add(sv);
        students1.add(sn);
        students1.add(hs);

        this.students = students1;
    }

    public List<String> getStudent() {
        List<String>stdList = new ArrayList<String>();

        for (Student s1 : this.students) {
            stdList.add(s1.getName());
        }

        return stdList;
    }
}
