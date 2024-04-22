package com.example.demo.JDBC;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.springframework.stereotype.Component;

import com.example.demo.JDBCEntities.Studentss;

@Component
public interface Studentdao {
    public int insert(Studentss s);

    public Studentss getRow(int Sid);
    
    public List<Map<String, Object>> getAllRows();
}
