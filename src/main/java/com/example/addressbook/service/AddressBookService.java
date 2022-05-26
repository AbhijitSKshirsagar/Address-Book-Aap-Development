package com.example.addressbook.service;

import com.example.addressbook.dto.AddressbookDTO;
import com.example.addressbook.model.AddressbookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressbookService {

    public List<AddressbookData> getAddressbookData() {
        List<AddressbookData> employeePayrolDataList=new ArrayList<>();
        employeePayrolDataList.add(new AddressbookData(1,new AddressbookDTO("Abhijit","Kshirsagar",
                "91+123456789","abhi@gmail.com","doctor colony","wardha","Maharashtra",147852)));
        return employeePayrolDataList;
    }

    @Override
    public AddressbookData getAddressbookDataById(int id) {
        AddressbookData addressbookData=new AddressbookData(2,new AddressbookDTO("Abhijit","Kshirsagar",
                "91+123456789","abhi@gmail.com","doctor colony","wardha","Maharashtra",147852));
        return addressbookData;
    }

    @Override
    public AddressbookData createAddressbookData(AddressbookDTO addressbookDTO) {
        AddressbookData addressbookData=new AddressbookData(1,addressbookDTO);
        return addressbookData;
    }

    @Override
    public AddressbookData updateAddressbookData(AddressbookDTO addressbookDTO) {
        AddressbookData addressbookData=new AddressbookData(1,addressbookDTO);
        return addressbookData;
    }

    @Override
    public void deleteAddressbookData(int id) {

    }
}
