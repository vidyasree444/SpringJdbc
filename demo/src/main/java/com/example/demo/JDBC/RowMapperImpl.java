package com.example.demo.JDBC;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.JDBCEntities.Studentss;

public class RowMapperImpl implements RowMapper{

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Studentss s1=new Studentss();
        s1.setId(rs.getInt("id"));
        s1.setName(rs.getString("name"));
        s1.setAddress(rs.getString("address"));
        
        return s1;
        
      }
    
}
