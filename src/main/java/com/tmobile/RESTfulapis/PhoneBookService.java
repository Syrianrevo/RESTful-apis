package com.tmobile.RESTfulapis;

import org.springframework.stereotype.Service;


import java.util.*;

@Service
public class PhoneBookService {

    PhoneBookRepo phoneBookRepo;
    public PhoneBookService(PhoneBookRepo phoneBookRepo) {
        this.phoneBookRepo = phoneBookRepo;
    }

    public Contact addContact(Contact contact) {
        return phoneBookRepo.save(contact);
    }

    public List<Contact> getAllContacts(){
        return phoneBookRepo.findAll();
    }


}
