package com.treevalue.h2;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

@Slf4j
@SpringBootTest
public class H2Test {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void insert() {
        try {
            jdbcTemplate.execute("INSERT INTO trees(id, name) VALUES(2,'Hemlock')");
            log.info("insert successfully...");
        } catch (Exception e) {
            log.info("insert failed...");
        }
    }

    @Test
    void name() {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT * FROM trees");
        log.info("list = {}", list);
    }

    @Test
    void update(){
        jdbcTemplate.execute("UPDATE trees SET name = 'Hemlock' WHERE id = 1k'");
        log.info("update successfully");
    }
}
