package com.sachin.association.aggregation;

import java.util.ArrayList;
import java.util.List;

/*
HAS-A Relationship
Country has sport person
 */

public class Country {
    private String name;
    List<SportPerson>sportPeople;

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSportPeople(List<SportPerson>sportPeople) {
        this.sportPeople = sportPeople;
    }

    public List<String> getSportPeople() {
        List<String> sportPeople = new ArrayList<String>();

        for (SportPerson plr : this.sportPeople) {
            sportPeople.add(plr.getName());
        }

        return sportPeople;
    }
}
