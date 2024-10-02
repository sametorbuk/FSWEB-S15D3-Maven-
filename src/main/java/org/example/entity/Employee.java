package org.example.entity;

public class Employee {
     private int id;
     private String firstName;
     private  String lastName;

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstname() {
        return firstName;
    }

    public Employee(int id, String lastName, String firstName) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
    }


}
