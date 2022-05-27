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

@RestController
@RequestMapping("/addressbook")
public class AddressbookController {
    @Autowired
    private IAddressbookService iAddressbookService;

    //get addressbook details
    @RequestMapping("/get")
    public ResponseEntity<ResponseDTO> getAddressbookData(){
        List<AddressbookData> addressbookData =iAddressbookService.getAddressbookData();
        ResponseDTO responseDTO=new ResponseDTO("Get call Success",addressbookData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    //get addressbook details by id
    @GetMapping("/{id}")
    public ResponseEntity<ResponseDTO> getAddressbookDataById(@PathVariable int id){
        AddressbookData addressbookData=iAddressbookService.getAddressbookDataById(id);
        ResponseDTO responseDTO=new ResponseDTO("Get call Success",addressbookData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    //create addressbook details
    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressbookData(@Valid @RequestBody AddressbookDTO addressbookDTO){
        AddressbookData addressbookData=iAddressbookService.createAddressbookData(addressbookDTO);
        ResponseDTO responseDTO=new ResponseDTO("created Addressbook data succesfully",addressbookData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    //update addressbook details
    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateAddressbookData(@PathVariable int id,@Valid @RequestBody AddressbookDTO addressbookDTO){
        AddressbookData addressbookData=iAddressbookService.updateAddressbookData(id,addressbookDTO);
        ResponseDTO responseDTO=new ResponseDTO("updated Addressbook data succesfully",addressbookData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    //delete addressbook details by id
    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDTO> deleteAddressbookData(@PathVariable int id){
        iAddressbookService.deleteAddressbookData(id);
        ResponseDTO responseDTO=new ResponseDTO("deleted succesfully",id);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
}
