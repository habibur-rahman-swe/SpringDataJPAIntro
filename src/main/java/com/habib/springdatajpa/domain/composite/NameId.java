package com.habib.springdatajpa.domain.composite;

import java.io.Serializable;

public class NameId implements Serializable {
    private String firstName;
    private String lastName;

    public NameId() {

    }

    public NameId(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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
}
