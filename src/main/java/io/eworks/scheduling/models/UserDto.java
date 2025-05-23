package io.eworks.scheduling.models;

import java.util.Map;

public class UserDto {

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;

    protected UserDto() {}

    public UserDto(String email) {
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

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setId(long id) {
        this.id = id;
    }
}