package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="b")
public class Bike {
	@Autowired
	Engine e;
}
