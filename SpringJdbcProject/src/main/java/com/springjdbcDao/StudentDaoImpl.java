package com.springjdbcDao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbcEntites.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(Student student) {

		// insert query
		String query = "insert into student(id, name, city) values(?,?,?)";

		// fire query
		int result = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());

		return result;
	}

	public int change(Student student) {
		// updating data
		String query = "update student set name=?, city=? where id=?";
		int r= this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}

}
