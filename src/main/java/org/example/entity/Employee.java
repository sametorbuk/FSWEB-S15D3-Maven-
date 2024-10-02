package org.example.entity;

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
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        Employee other = (Employee) obj;
        return this.id == other.id;
    }
}
