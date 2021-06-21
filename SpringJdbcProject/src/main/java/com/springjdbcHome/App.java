package com.springjdbcHome;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbcDao.StudentDao;
import com.springjdbcEntites.Student;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Program Started..............");

		// Spring JDBC =>> JdbcTemplate
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springjdbcHome/config.xml");
		
		StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
		
		
		// insert operation
		/*
		 * 
		 * Student st=new Student(); st.setId(765); st.setName("Rohan");
		 * st.setCity("Kolkata");
		 * 
		 * int result = studentDao.insert(st);
		 * System.out.println("student added---"+result);
		 */
		
		// update operation
		/*
		 * Student st= new Student(); st.setCity("Patna"); st.setId(213);
		 * st.setName("Umesh Kumar");
		 * 
		 * int r=studentDao.change(st); System.out.println("data updated -->"+r);
		 */
		
		//delete operation
		/*
		 * int r=studentDao.delete(445); System.out.println("data deleted-->"+r);
		 */
		
		//fetching single student data
		/*
		 * Student student = studentDao.getStudent(213); System.out.println(student);
		 */
		
		// fetching multiple student data
		List<Student>st=studentDao.getAllStudents();
		for(Student x:st) {
			System.out.println(x);
		}
	}
}
