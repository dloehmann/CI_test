package com.swathisprasad.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;


@RestController
public class PersonController {

    private static AtomicLong counter = new AtomicLong();

    @RequestMapping("/persons")
    public List<Person> persons() {
        return getAllPersons();
    }


//    @RequestMapping("/persons")
//    public List<Person> persons(@RequestParam(value="name") String name) {
//        if (!StringUtils.isEmpty(name)) {
//            return getAllPersons().stream().filter(person -> name.equals(name)).collect(Collectors.toList());
//        }
//        return getAllPersons();
//    }
//
//    @RequestMapping("/persons/:id")
//    public List<Person> persons(@RequestParam(value="id") Integer id) {
//        if (id != null) {
//            return getAllPersons().stream().filter(person -> id == id).collect(Collectors.toList());
//        }
//        return getAllPersons();
//    }

    private List<Person> getAllPersons() {
        return getDummyData();
    }



    private List<Person> getDummyData() {
        return Arrays.asList(
                new Person(1, "Dennis Löhmann", "Humperdinckweg 16", "Hamburg", "22761", "+4917680830584",
                "d.loehmann@gmx.de"),
                new Person(1, "Eva Kullová", "Humperdinckweg 16", "Hamburg", "22761", "+491772028149",
                "eva.kullova@gmail.com")
                );
    }
}