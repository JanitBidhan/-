package edu.gmu.hackthon.dao;

import edu.gmu.hackthon.model.person.InfoProvided;
import edu.gmu.hackthon.model.person.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

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
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, (rs, rowNum) ->
                new Person(
                        rs.getString("stateId"),
                        rs.getString("firstName"),
                        rs.getString("lastName")
                ));
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
