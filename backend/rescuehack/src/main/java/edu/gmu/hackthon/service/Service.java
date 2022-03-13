package edu.gmu.hackthon.service;

import edu.gmu.hackthon.model.common.UrgentInfo;
import edu.gmu.hackthon.model.person.Food;
import edu.gmu.hackthon.model.person.Person;

import java.util.List;

public interface Service {
    Person getPerson(String id);

    List<Food> getFood();

    boolean insertPerson(Person person);

    List<UrgentInfo> getUrgentInfo();
}