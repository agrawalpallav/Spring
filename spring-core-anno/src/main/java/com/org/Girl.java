package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("g")
public class Girl {
	@Autowired
	@Qualifier("bs")
	IceCream ic;
}
