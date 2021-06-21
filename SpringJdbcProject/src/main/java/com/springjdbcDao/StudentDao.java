package com.springjdbcDao;

import com.springjdbcEntites.Student;
import java.util.*;

public interface StudentDao {

	public int insert(Student student);

	public int change(Student student);

	public int delete(int id);

	public Student getStudent(int id);
	
	public List<Student> getAllStudents();
}
