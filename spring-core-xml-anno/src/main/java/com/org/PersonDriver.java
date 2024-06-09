package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonDriver {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		Person p =ac.getBean("perc", Person.class);
		System.out.println(p.name);
		System.out.println(p.age);
	} 
}
