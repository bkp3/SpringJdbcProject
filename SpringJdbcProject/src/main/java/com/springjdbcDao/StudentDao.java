package com.springjdbcDao;

import com.springjdbcEntites.Student;

public interface StudentDao {

	public int insert(Student student);
	
	public int change(Student student);
}
