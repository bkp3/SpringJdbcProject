package com.springjdbcDao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbcEntites.Student;


public class StudentDaoImpl implements StudentDao{
	
	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		
		//insert query
        String query = "insert into student(id, name, city) values(?,?,?)";
        
        //fire query
        int result = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		
		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	

}
