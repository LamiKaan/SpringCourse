package com.lkk.SpringCourse.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {
    // Define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // GenerationType.AUTO/SEQUENCE/TABLE custom strategy de yazilabiliyor
    @Column(name = "id")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;

    // Define no-arg (@Entity icin zorunlu) and arg constructors
    public Customer() {

    }

    public Customer(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // Define getter and setter methods, and toString() method
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", " +
                "email='" + email + '\'' + '}';
    }
}
