package com.babysitting.subscription.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.github.jasminb.jsonapi.annotations.Id;
import com.github.jasminb.jsonapi.annotations.Type;
import com.google.common.base.Objects;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

@Type("User")
@JsonInclude(NON_NULL)
public class UserDto {

    @Id
    private Long id;

    private String firstName;

    private String lastName;

    private String address;

    private String zipCode;

    private String city;

    private String email;

    private String country;

    private String password;

    private String phoneNumber;

    public Long getId() {
        return id;
    }

    public UserDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserDto setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserDto setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public UserDto setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getZipCode() {
        return zipCode;
    }

    public UserDto setZipCode(String zipCode) {
        this.zipCode = zipCode;
        return this;
    }

    public String getCity() {
        return city;
    }

    public UserDto setCity(String city) {
        this.city = city;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserDto setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public UserDto setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserDto setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public UserDto setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDto userDto = (UserDto) o;
        return Objects.equal(id, userDto.id) &&
                Objects.equal(firstName, userDto.firstName) &&
                Objects.equal(lastName, userDto.lastName) &&
                Objects.equal(address, userDto.address) &&
                Objects.equal(zipCode, userDto.zipCode) &&
                Objects.equal(city, userDto.city) &&
                Objects.equal(email, userDto.email) &&
                Objects.equal(country, userDto.country) &&
                Objects.equal(password, userDto.password) &&
                Objects.equal(phoneNumber, userDto.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, firstName, lastName, address, zipCode, city, email, country, password, phoneNumber);
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}