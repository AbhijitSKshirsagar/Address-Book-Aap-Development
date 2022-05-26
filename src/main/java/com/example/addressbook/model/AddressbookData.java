package com.example.addressbook.model;

import com.example.addressbook.dto.AddressbookDTO;

public class AddressbookData {
    private int id;
    private String fName;
    private String lName;
    private String phoneNumber;
    private String email;
    private String address;
    private String city;
    private String state;
    private long zipCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getZipCode() {
        return zipCode;
    }

    public void setZipCode(long zipCode) {
        this.zipCode = zipCode;
    }

    public AddressbookData(int id, AddressbookDTO addressbookDTO) {
        this.id = id;
        this.fName = addressbookDTO.getFName();
        this.lName = addressbookDTO.getLName();
        this.phoneNumber = addressbookDTO.getPhoneNumber();
        this.email = addressbookDTO.getEmail();
        this.address = addressbookDTO.getAddress();
        this.city = addressbookDTO.getCity();
        this.state = addressbookDTO.getState();
        this.zipCode = addressbookDTO.getZipCode();
    }

    public AddressbookData() {
    }
}
