package com.example.addressbook.controller;

import com.example.addressbook.dto.AddressbookDTO;
import com.example.addressbook.dto.ResponseDTO;
import com.example.addressbook.model.AddressbookData;
import com.example.addressbook.service.IAddressbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static com.sun.xml.internal.ws.api.message.Packet.Status.Response;

@RestController
@RequestMapping("/addressbook")
public class AddressbookController {
    @Autowired
    private IAddressbookService AddressbookService;

    //get addressbook details
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public ResponseEntity<ResponseDTO> getAddressbookData(){
        List<AddressbookData> addressbookData =AddressbookService.getAddressbookData();
        ResponseDTO responseDTO=new ResponseDTO("Get call Success",addressbookData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    //get addressbook details by id
    @GetMapping("/{id}")
    public ResponseEntity<ResponseDTO> getAddressbookDataById(@PathVariable int id){
        AddressbookData addressbookData=AddressbookService.getAddressbookDataById(id);
        ResponseDTO responseDTO=new ResponseDTO("Get call Success for id successfull",addressbookData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    //create addressbook details
    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressbookData(@Valid @RequestBody AddressbookDTO addressbookDTO){
        AddressbookData addressbookData=AddressbookService.createAddressbookData(addressbookDTO);
        ResponseDTO responseDTO=new ResponseDTO("created Addressbook data succesfully",addressbookData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    //update addressbook details
    @PutMapping("/update/{id}")
    public ResponseEntity<ResponseDTO> updateAddressbookData(@PathVariable int id,@Valid @RequestBody AddressbookDTO addressbookDTO){
        AddressbookData addressbookData=AddressbookService.updateAddressbookData(id,addressbookDTO);
        ResponseDTO responseDTO=new ResponseDTO("updated Addressbook data succesfully",addressbookData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    //delete addressbook details by id
    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDTO> deleteAddressbookData(@PathVariable int id){
        AddressbookService.deleteAddressbookData(id);
        ResponseDTO responseDTO=new ResponseDTO("deleted succesfully",id);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    //sort addressbook by city names
    @GetMapping("/sortByCity")
    public ResponseEntity<ResponseDTO> sortAddressBookByCity(){
        List<AddressbookData> addressbookData = null;
        addressbookData = AddressbookService.sortAddressBookByCity();
        ResponseDTO responseDTO = new ResponseDTO("sort AddressBook By City Success",addressbookData);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

    @GetMapping("/sortByState")
    public ResponseEntity<ResponseDTO> sortAddressBookByState(){
        List<AddressbookData> addressbookData = null;
        addressbookData = AddressbookService.sortAddressBookByState();
        ResponseDTO responseDTO = new ResponseDTO("sort AddressBook By State Success",addressbookData);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

}
