package com.example.demo;

import com.example.demo.JDBC.Studentdao;
import com.example.demo.JDBCEntities.Studentss;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	

	@Autowired
	Studentdao sdao;

	@Autowired
	Studentss ss;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//String sql = "CREATE TABLE Studentss(id INT,name VARCHAR(255),address VARCHAR(255));";
		//jt.update(sql);
		System.out.println("Table 'SpringJdbc' created successfully.");
	
		//String sql = "INSERT INTO Studentss VALUES(4,'sree','anakapalli')";
		//jt.execute(sql);

		//==========================================

		//jt.update(sql, 1, "John Doe", "123 Main St");
		//jt.update(sql, 2, "Jane Smith", "456 Elm St");
		/*ss.setId(1);
		ss.setName("vidya");
		ss.setAddress("gajuwaka");

		int r=sdao.insert(ss);

		System.out.println("Values inserted into 'SpringJdbc' table."+r);
		}*/
		Studentss ss=sdao.getRow(4);
        System.out.println("details"+ss);

		List<Map<String, Object>> ss1=sdao.getAllRows();
        System.out.println("details"+ss1);

	}
}
