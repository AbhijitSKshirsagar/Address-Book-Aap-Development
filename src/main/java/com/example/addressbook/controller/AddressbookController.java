package com.example.addressbook.controller;

import com.example.addressbook.dto.AddressbookDTO;
import com.example.addressbook.dto.ResponseDTO;
import com.example.addressbook.model.AddressbookData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressbookController {
    //get addressbook details
    @RequestMapping("/get")
    public ResponseEntity<ResponseDTO> getAddressbookData(){
        AddressbookData addressbookData=new AddressbookData(1,new AddressbookDTO("Abhijit","Kshirsagar","91+1363474546",
                "abhi@123","doctore colony","wardha","maharashtra",12345));
        ResponseDTO responseDTO=new ResponseDTO("Get call Success",addressbookData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    //get addressbook details by id
    @GetMapping("/{id}")
    public ResponseEntity<ResponseDTO> getAddressbookData(@PathVariable int id){
        AddressbookData addressbookData=new AddressbookData(1,new AddressbookDTO("Abhijit","Khsirsagar","91+123459879",
                "abhi@123","doctore colony","Nagpur","Maharashtra",12345));
        ResponseDTO responseDTO=new ResponseDTO("Get call Success",addressbookData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    //create addressbook details
    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressbookData(@RequestBody AddressbookDTO addressbookDTO){
        AddressbookData addressbookData=new AddressbookData(1,addressbookDTO);
        ResponseDTO responseDTO=new ResponseDTO("created Addressbook data succesfully",addressbookData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    //update addressbook details
    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateAddressbookData(@RequestBody AddressbookDTO addressbookDTO){
        AddressbookData addressbookData=new AddressbookData(1,addressbookDTO);
        ResponseDTO responseDTO=new ResponseDTO("updated Addressbook data succesfully",addressbookData);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    //delete addressbook details by id
    @DeleteMapping("/{id}")
    public ResponseEntity<ResponseDTO> deleteAddressbookData(@PathVariable int id){
        ResponseDTO responseDTO=new ResponseDTO("deleted succesfully",id);
        return  new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
}
