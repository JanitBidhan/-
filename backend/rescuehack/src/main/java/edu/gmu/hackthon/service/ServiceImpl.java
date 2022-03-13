package edu.gmu.hackthon.service;

import edu.gmu.hackthon.dao.FoodDao;
import edu.gmu.hackthon.dao.PersonDao;
import edu.gmu.hackthon.dao.UrgentInfoDao;
import edu.gmu.hackthon.model.common.UrgentInfo;
import edu.gmu.hackthon.model.person.Food;
import edu.gmu.hackthon.model.person.Person;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    @Autowired
    PersonDao personDao;
    @Autowired
    FoodDao foodDao;
    @Autowired
    UrgentInfoDao UrgentInfoDao;
    public Person getPerson(String id) {
        if (id != null && !id.equals(""))
            return personDao.getPerson(id);
        else {
            return new Person();
        }
    }
    public List<Food> getFood()
    {
        return foodDao.gerNearbyFood();
    }
    @Override
    public boolean insertPerson(Person person) {
        return false;
    }

    @Override
    public List<UrgentInfo> getUrgentInfo() {
        return UrgentInfoDao.getAllInfo();
    }

}