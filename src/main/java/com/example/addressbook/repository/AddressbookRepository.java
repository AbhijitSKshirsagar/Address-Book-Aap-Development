package com.example.addressbook.repository;

import com.example.addressbook.model.AddressbookData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressbookRepository extends JpaRepository<AddressbookData,Integer> {
}
