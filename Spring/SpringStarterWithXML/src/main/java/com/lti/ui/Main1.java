package com.lti.ui;

import com.lti.model.Address;
import com.lti.model.Student;

public class Main1 {

	public static void main(String[] args) {
		
		Student student =new Student(1,"Lakarand",200);
		Address address = new Address();
		address.setAddressId(10);
		address.setCity("Mumbai");
		address.setPin("400710");
		
		student.setAddress(address); // this is setter injection which will be done by spring automatically
		
		System.out.println(student);
		System.out.println(student.getAddress());

	}

}
