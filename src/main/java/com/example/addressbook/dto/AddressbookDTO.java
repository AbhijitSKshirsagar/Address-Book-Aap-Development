package com.example.addressbook.dto;

import lombok.Data;

@Data
public class AddressbookDTO {
    public String fName;
    public String lName;
    public String phoneNumber;
    public String email;
    public String address;
    public String city;
    public String state;
    public long zipCode;

}
