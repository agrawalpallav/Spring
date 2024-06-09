package com.org;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component(value ="d") or 
@Component("d")
@Scope("prototype")
public class Donkey {

}
