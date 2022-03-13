package edu.gmu.hackthon.dao;

import edu.gmu.hackthon.model.common.Location;
import edu.gmu.hackthon.model.person.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class FoodDaoImpl extends JdbcDaoSupport implements FoodDao {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }

    @Override
    public List<Food> gerNearbyFood() {
        String sql = "SELECT * FROM food";
        List<Food> foods = new ArrayList<>();

        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);

        for (Map row : rows) {
            Food obj = new Food();
            obj.setId(((int) row.get("id")));
            boolean available = (int) row.get("available") > 0 ? true : false;
            obj.setAvailable(available);
            obj.setAddress(((String) row.get("address")));
            obj.setLocationid((int) row.get("location"));
            String sql3 = "SELECT * FROM location where id=?";
            obj.setLocation(jdbcTemplate.queryForObject(sql3, new Object[]{obj.getLocationid()}, (rs, rowNum) ->
                    new Location(
                            rs.getInt("id"),
                            rs.getDouble("latitude"),
                            rs.getDouble("longitude"),
                            rs.getString("gmapslink"),
                            rs.getBoolean("safe")
                    )));
            foods.add(obj);
        }
        return foods;
    }

    @Override
    public boolean updateFood(Food food) {
        return false;
    }

    @Override
    public boolean createFood(Food food) {
        return false;
    }
}
