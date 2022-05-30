package com.example.addressbook.service;

import com.example.addressbook.dto.AddressbookDTO;
import com.example.addressbook.dto.ResponseDTO;
import com.example.addressbook.exception.AddressbookException;
import com.example.addressbook.model.AddressbookData;
import com.example.addressbook.repository.AddressbookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AddressBookService implements IAddressbookService {

    @Autowired
    private AddressbookRepository addressbookRepository;

    public List<AddressbookData> getAddressbookData() {
        return addressbookRepository.findAll();
    }

    @Override
    public List<AddressbookData> sortAddressBookByCity() {
        return addressbookRepository.sortByCity();
    }

    @Override
    public List<AddressbookData> sortAddressBookByState() {
        return addressbookRepository.sortByState();
    }

    @Override
    public AddressbookData getAddressbookDataById(int id) {
        return addressbookRepository.findById(id).orElseThrow(()-> new AddressbookException("Exception with id"+id+"does not exist!!"));
    }

    @Override
    public AddressbookData createAddressbookData(AddressbookDTO addressbookDTO) {
        AddressbookData addressbookData=new AddressbookData(addressbookDTO);
        log.info("Addressbook data:"+addressbookData.toString());
        return addressbookRepository.save(addressbookData);
    }

    @Override
    public AddressbookData updateAddressbookData(int id,AddressbookDTO addressbookDTO) {
        AddressbookData addressbookData=this.getAddressbookDataById(id);
        addressbookData.updateAddressbookData(addressbookDTO);
        return addressbookRepository.save(addressbookData);
    }

    @Override
    public void deleteAddressbookData(int id) {
        AddressbookData addressbookData=this.getAddressbookDataById(id);
        addressbookRepository.delete(addressbookData);
    }


}
