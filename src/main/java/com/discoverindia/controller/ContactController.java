package com.discoverindia.controller;


import com.discoverindia.entity.Contact;
import com.discoverindia.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //class handles HTTP requests and returns JSON responses."
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*") //front and backedn are runnninng on diff ports

public class ContactController {

    @Autowired // depedency injection
    private ContactService contactService;

    @PostMapping
    public Contact saveContact(@RequestBody Contact contact){
        return contactService.saveContact(contact);
    }

}
