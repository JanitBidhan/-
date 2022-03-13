package edu.gmu.hackthon.dao;

import edu.gmu.hackthon.model.person.FamilyMembership;
import edu.gmu.hackthon.model.person.InfoProvided;
import edu.gmu.hackthon.model.common.Location;
import edu.gmu.hackthon.model.person.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.ArrayList;

@Repository
public class PersonDaoImpl extends JdbcDaoSupport implements PersonDao {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }

    @Override
    public Person getPerson(String id) {
        String sql = "SELECT * FROM person where stateId=?";

        Person person = jdbcTemplate.queryForObject(sql, new Object[]{id}, (rs, rowNum) ->
                new Person(
                        rs.getString("id"),
                        rs.getInt("stateId"),
                        rs.getString("firstName"),
                        rs.getString("lastName"),
                        rs.getString("address"),
                        rs.getInt("location"),
                        rs.getInt("infoProvided"),
                        rs.getString("family"),
                        rs.getInt("needs"),
                        rs.getString("photourl")
                ));
        String sql2 = "SELECT * FROM infoProvided where id=?";
        InfoProvided infoProvided = jdbcTemplate.queryForObject(sql2, new Object[]{person.getInfoId()}, (rs, rowNum) ->
                new InfoProvided(
                        rs.getInt("id"),
                        rs.getBoolean("tanks"),
                        rs.getBoolean("bombs"),
                        rs.getBoolean("gunfire"),
                        rs.getBoolean("evacuate"),
                        rs.getBoolean("food"),
                        rs.getString("imagelink")
                ));
        person.setInfoProvided(infoProvided);
        String sql3 = "SELECT * FROM location where id=?";
        Location location = jdbcTemplate.queryForObject(sql3, new Object[]{person.getLocationId()}, (rs, rowNum) ->
                new Location(
                        rs.getInt("id"),
                        rs.getDouble("latitude"),
                        rs.getDouble("longitude"),
                        rs.getString("gmapslink"),
                        rs.getBoolean("safe")
                ));
        person.setLocation(location);
        person.setFamily(new FamilyMembership(new ArrayList<>()));
        return person;
    }

    @Override
    public boolean insertPerson(Person person) {
        return false;
    }

    @Override
    public boolean insertInformations(InfoProvided data) {
        return false;
    }
}
