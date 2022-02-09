package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeSpringMain1 {

	public static void main(String[] args) {

		//following line creates spring container	
		ApplicationContext 	applicationContext=new ClassPathXmlApplicationContext("employee.cfg.xml");

		//hey container..give me car bean

		Employee employee1 =(Employee) applicationContext.getBean("emp1");

		System.out.println(employee1);

		Employee employee2 =(Employee) applicationContext.getBean("emp2");

		System.out.println(employee2);

	}

}
