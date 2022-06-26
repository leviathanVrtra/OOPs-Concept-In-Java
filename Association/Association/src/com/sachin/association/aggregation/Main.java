package com.sachin.association.aggregation;

/*
HAS-A Relationship
Aggregation is a relatively more loosely coupled relation than composition,
Class one can exist without the other independently.
Aggregation in java is also called a weak association/bonding.
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SportPerson sachin = new SportPerson("Sachin");
        SportPerson dhoni = new SportPerson("Dhoni");
        SportPerson rohit = new SportPerson("Rohit");
        SportPerson virat = new SportPerson("Virat Kohli");

        Country india = new Country("India");

        List<SportPerson> sportPeople = new ArrayList<SportPerson>();
        sportPeople.add(sachin);
        sportPeople.add(dhoni);
        sportPeople.add(rohit);
        sportPeople.add(virat);

        india.setSportPeople(sportPeople);

        System.out.println(india.getName() + " team players : " + india.getSportPeople());
    }
}