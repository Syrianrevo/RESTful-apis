package com.tmobile.RESTfulapis;


import org.springframework.web.bind.annotation.*;
import java.util.*;
@RestController
@RequestMapping("/phoneBook/contacts")
public class PhoneBookController {


    PhoneBookService phoneBookService;


    public PhoneBookController(PhoneBookService phoneBookService) {
        this.phoneBookService = phoneBookService;
    }

    @GetMapping
    public List<Contact> getAllContacts(){
        return phoneBookService.getAllContacts();
    }
    @PostMapping
    public Contact addNewContact(@RequestBody Contact contact){
        return phoneBookService.addContact(contact);
    }
}
