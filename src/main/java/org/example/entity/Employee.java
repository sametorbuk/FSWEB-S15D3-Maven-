package org.example.entity;

import java.util.Objects;

public class Employee {
     private int id;
    private String firstname;
     private  String lastname;


    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public Employee(int id, String firstname, String lastName) {
        this.id = id;
        this.lastname = lastName;
        this.firstname = firstname;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
