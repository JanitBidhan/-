package edu.gmu.hackthon.service;

import edu.gmu.hackthon.dao.PersonDao;
import edu.gmu.hackthon.model.person.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonDao personDao;

    public Person getPerson(String id) {
        if (id != null && !id.equals(""))
            return personDao.getPerson(id);
        else
            return new Person();
    }

    @Override
    public boolean insertPerson(Person person) {
        return false;
    }

}