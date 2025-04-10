package io.eworks.scheduling.entities;

import java.util.Map;

public class User {

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;
    private Map<String, String> properties;

    protected User() {}

    public User(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format(
                "UserDto[id=%d, firstName='%s', lastName='%s', email='%s']",
                id, firstName, lastName, email);
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Map<String, String> getProperties() {
        return properties;
    }
    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}