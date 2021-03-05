package com.fetchdata.repository;

import com.fetchdata.model.Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClassRepoImpl implements IClassRepo {
    @Autowired
    JdbcTemplate jt;

    @Override
    public List<Class> fetchAll() {
        String sql = "select * from classdb.classes;";
        RowMapper <Class>rowMapper = new BeanPropertyRowMapper<>(Class.class);

        return jt.query(sql, rowMapper);
    }

    @Override
    public Class findPersonById(int id) {
        return null;
    }

    @Override
    public Class addPerson(Class p) {
        return null;
    }

    @Override
    public Class deletePerson(int id) {
        return null;
    }

    @Override
    public Class updatePerson(int id, Class p) {
        return null;
    }
}
