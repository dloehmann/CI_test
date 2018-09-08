package com.swathisprasad.springboot.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author Dennis Löhmann (Holisticon AG) 08.09.18
 **/
//@Entity
@Getter
@Setter
@AllArgsConstructor
//@Table(name="persons")

public class Person {

//    @Id
//    @Lob
    private int id;
//    @Lob
    private String name;
//    @Lob
    private String address;
//    @Lob
    private String city;
//    @Lob
    private String zip;
//    @Lob
    private String phone;
//    @Lob
    private String eMail;


}
