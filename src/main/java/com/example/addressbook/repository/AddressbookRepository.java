package com.example.addressbook.repository;

import com.example.addressbook.model.AddressbookData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressbookRepository extends JpaRepository<AddressbookData,Integer> {
    //List<AddressbookData> findAddressbookDataByCity(String city);
    @Query(value = "select * from addressbook_details order by city",nativeQuery = true)
    List<AddressbookData> sortByCity();

    @Query(value = "select * from addressbook_details order by state",nativeQuery = true)
    List<AddressbookData> sortByState();

}
