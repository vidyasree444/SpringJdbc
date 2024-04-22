package com.example.demo.JDBC;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import com.example.demo.JDBCEntities.Studentss;

@Component
public class StudentdaoImp implements Studentdao {

    @Autowired
    private JdbcTemplate jt;

    @Override
    public int insert(Studentss s) {
        String str="insert into Studentss(id,name,address) values(?,?,?)";
        int r=jt.update(str,s.getId(),s.getName(),s.getAddress());
        return r;
        }

    public JdbcTemplate getJt() {
        return jt;
    }

    public void setJt(JdbcTemplate jt) {
        this.jt = jt;
    }

    @Override
    public Studentss getRow(int Sid) {
        String que="select * from Studentss where id=?";

        RowMapper<Studentss> rm=new RowMapperImpl();
        Studentss ss = jt.queryForObject(que,rm,Sid);
        return ss;
        
       }

    @Override
     public List<Map<String, Object>> getAllRows() {
       // String q="select * from Studentss";
       // List<Studentss> sm=jt.query(q,new RowMapperImpl());
       // return sm;

    List<Map<String, Object>> r = jt.queryForList("SELECT * FROM Studentss");
    return r;

       
    }

    
        
    
}
