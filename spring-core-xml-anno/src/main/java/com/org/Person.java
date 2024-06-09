package com.org;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("perc")
public class Person {
	String name;
	int age;
	
	@Value("Balaji")
	public void setName(String name) {
		this.name = name;
	}
	@Value("60")
	public void setAge(int age) {
		this.age = age;
	}
	
}
