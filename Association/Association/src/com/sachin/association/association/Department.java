package com.sachin.association.association;

import java.util.ArrayList;
import java.util.List;

/*
HAS-A Relationship
Department has professor
 */

class Department {
    private String name;
    List<Professor> staff;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStaff(List<Professor> staff) {
        this.staff = staff;
    }

    public List<String> getStaff() {
        List<String> professor = new ArrayList<String>();
        for (Professor pro : this.staff) {
            professor.add(pro.getName());
        }
        return professor;
    }
}