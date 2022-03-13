package edu.gmu.hackthon.controller;

import edu.gmu.hackthon.model.person.Person;
import edu.gmu.hackthon.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @RequestMapping(value = "/person/{id}", method = RequestMethod.GET)
    public Person getPerson(@PathVariable String id) {
        return personService.getPerson(id);
    }

    @RequestMapping(value = "/insertperson", method = RequestMethod.POST)
    public void addPerson(@RequestBody Person person) {
        personService.insertPerson(person);
    }

}
