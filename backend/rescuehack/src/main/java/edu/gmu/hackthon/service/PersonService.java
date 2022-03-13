package edu.gmu.hackthon.service;

import edu.gmu.hackthon.model.person.Person;

public interface PersonService {
    Person getPerson(String id);

    boolean insertPerson(Person person);
}