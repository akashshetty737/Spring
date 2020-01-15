package com.lti.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.model.Student;

public class Main2 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml"); 
		
		Student student = (Student)context.getBean("student");
		Student student1 = (Student)context.getBean("student");
		student1.setRollNumber(2);
		student1.setStudentName("Akash");
		student1.setStudentScore(40);
		
		System.out.println(student);
		System.out.println(student.getAddress());
		System.out.println(student1);
		System.out.println(student1.getAddress());
		
	}

}
