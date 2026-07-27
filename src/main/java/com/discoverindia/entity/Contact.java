package com.discoverindia.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity //- represents table in my dataset
@Table(name="contacts") // -telss mysql to create table named contacts in database

public class Contact {
    @Id // marks primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // automatically generates ID's
    private long id; // private because any class could cahgne it directly ==> so nobody can access it directly
    private String name ;
    private String email;
    private String phone;

    @Column(columnDefinition = "TEXT") //String columns are limited in size.
    //allows users to write longer messages in the contact form.
    private String message;

}
