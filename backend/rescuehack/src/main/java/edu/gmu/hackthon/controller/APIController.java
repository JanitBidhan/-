package edu.gmu.hackthon.controller;

import edu.gmu.hackthon.model.common.UrgentInfo;
import edu.gmu.hackthon.model.person.Food;
import edu.gmu.hackthon.model.person.InfoProvided;
import edu.gmu.hackthon.model.person.Person;
import edu.gmu.hackthon.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class APIController {

    @Autowired
    Service service;


    @RequestMapping(value = "/person/{id}", method = RequestMethod.GET)
    public Person getPerson(@PathVariable String id) {
        return service.getPerson(id);
    }

    @RequestMapping(value = "/food", method = RequestMethod.GET)
    public List<Food> getFood() {
        return service.getFood();
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public List<UrgentInfo> getUrgentInfo() {
        return service.getUrgentInfo();
    }

    @RequestMapping(value = "/insertperson", method = RequestMethod.POST)
    public void addPerson(@RequestBody Person person) {
        service.insertPerson(person);
    }

}
