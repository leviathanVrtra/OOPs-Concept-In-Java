package com.sachin.copy.shallow;

public class Department {
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
}
