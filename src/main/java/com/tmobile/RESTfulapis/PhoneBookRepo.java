package com.tmobile.RESTfulapis;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneBookRepo extends JpaRepository<Contact, Long> {

}
