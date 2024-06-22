package com.day1.entity;

import javax.persistence.*;

@Entity
//@Table(name = "stu")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int roll_number;
    @Column(name = "stu_name")
    private String name;
    private String email;
    private String designation;
    long contact;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student(int roll_number, String name, String email, String designation, long contact) {
        this.roll_number = roll_number;
        this.name = name;
        this.email = email;
        this.designation = designation;
        this.contact = contact;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }


    public Student(){}

    public int getRoll_number() {
        return roll_number;
    }

    public void setRoll_number(int roll_number) {
        this.roll_number = roll_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }
}
