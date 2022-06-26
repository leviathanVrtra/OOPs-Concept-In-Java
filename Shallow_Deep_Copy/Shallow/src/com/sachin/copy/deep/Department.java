package com.sachin.copy.deep;

public class Department implements Cloneable {
    private String eID;
    private String name;
    private String designation;

    public Department(String eID, String name, String designation) {
        this.eID = eID;
        this.name = name;
        this.designation = designation;
    }

    public void setID(String eID) {
        this.eID = eID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getID() {
        return eID;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
