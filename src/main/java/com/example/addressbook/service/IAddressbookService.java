package com.example.addressbook.service;

import com.example.addressbook.dto.AddressbookDTO;
import com.example.addressbook.model.AddressbookData;

import java.util.List;

public interface IAddressbookService {
    List<AddressbookData> getAddressbookData();
    AddressbookData getAddressbookDataById(int id);
    AddressbookData createAddressbookData(AddressbookDTO addressbookDTO);
    AddressbookData updateAddressbookData(AddressbookDTO addressbookDTO);
    void deleteAddressbookData(int id);
}
