package com.discoverindia.service;

import com.discoverindia.entity.Contact;
import com.discoverindia.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository; // dependency injection

    public Contact saveContact(Contact contact) {
        return contactRepository.save(contact);
    }
}

