package com.sachin.association.composition;

/*
Composition is a form of relation that is more tightly coupled.
The classes cannot exist independent of each other.
If the larger class which holds the objects of the smaller class is removed,
it also means logically the smaller class cannot exist.
 */

public class Main {
    public static void main(String[] args) {
        College iita = new College("IIIT-A");
        iita.setStudents();;

        System.out.println("The students studying in " + iita.getName() + " are " + iita.getStudent());
    }
}
