package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GirlDriver {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		Girl g = ac.getBean("g", Girl.class);
		System.out.println(g);
		System.out.println(g.ic);
	}
}
