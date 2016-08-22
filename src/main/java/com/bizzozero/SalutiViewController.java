package com.bizzozero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.io.Serializable;
import java.util.List;

/**
 * Created by bizza on 18/08/16.
 */
@Controller
public class SalutiViewController {

    @Autowired
    PersonRepository personRepository;


    public String getSalutiText() {
        return "Ma come siamo bravi";
    }

    public Person getPerson() {

        List<Person> baggins = personRepository.findByLastName("Baggins");
        return baggins.get(0);

    }

    public List<Person> getPersonList() {
        return personRepository.findAll();
    }


}
