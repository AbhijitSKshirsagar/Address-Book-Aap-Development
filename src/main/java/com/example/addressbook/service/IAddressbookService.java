package com.example.addressbook.service;

import com.example.addressbook.dto.AddressbookDTO;
import com.example.addressbook.dto.ResponseDTO;
import com.example.addressbook.model.AddressbookData;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IAddressbookService {

    List<AddressbookData> getAddressbookData();
    AddressbookData getAddressbookDataById(int id);
    AddressbookData createAddressbookData(AddressbookDTO addressbookDTO);
    AddressbookData updateAddressbookData( int id, AddressbookDTO addressbookDTO);
    void deleteAddressbookData(int id);
    List<AddressbookData> sortAddressBookByCity();
    List<AddressbookData> sortAddressBookByState();

}
