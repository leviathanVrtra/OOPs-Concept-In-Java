package com.sachin.association.association;

/*
Association in java is the relationship that can be established between any two classes.
1. One-to-One relation
2. One-to-many relation
3. Many-to-one relation
4. Many-to-many relation
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Professor sv = new Professor("Sachin");
        Professor sn = new Professor("Sonu");
        Professor hs = new Professor("Harish");
        Professor vr = new Professor("Verma");

        Department cse = new Department("CSE");

        List<Professor> staff = new ArrayList<Professor>();
        staff.add(sv);
        staff.add(sn);
        staff.add(hs);
        staff.add(vr);

        cse.setStaff(staff);

        System.out.println(cse.getName() + " department staff is " + cse.getStaff());

    }
}