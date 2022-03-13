package edu.gmu.hackthon.dao;

import edu.gmu.hackthon.model.common.UrgentInfo;
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
public class UrgentInfoImpl extends JdbcDaoSupport implements UrgentInfoDao {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }

    @Override
    public List<UrgentInfo> getAllInfo() {
        String sql = "SELECT * FROM urgentinfo";


        List<UrgentInfo> urgentData = new ArrayList<>();

        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);

        for (Map row : rows) {
            UrgentInfo obj = new UrgentInfo(
                    (int) row.get("id"),
                    (String) row.get("data"),
                    (int) row.get("priority")
            );

            urgentData.add(obj);
        }
        return urgentData;
    }
}
