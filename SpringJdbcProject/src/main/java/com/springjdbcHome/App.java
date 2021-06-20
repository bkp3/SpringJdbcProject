package com.springjdbcHome;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbcDao.StudentDao;
import com.springjdbcEntites.Student;

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
		
		Student st=new Student();
		st.setId(765);
		st.setName("Rohan");
		st.setCity("Kolkata");
		
		int result = studentDao.insert(st);
		System.out.println("student added---"+result);


	}
}
