package com.org;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	@RequestMapping("/load")
	public ModelAndView loadEmp() {
		
		Employee e = new Employee();
		e.setEid(101);
		e.setEname("MILLER");
		e.setEsal(1250);
		
		ModelAndView mav = new ModelAndView("emp");
		mav.addObject("emp",e);
		return mav;
	}
	
	@RequestMapping("/read")
	public ModelAndView getEmp() {
		
		Employee e1 = new Employee();
		e1.setEid(101);
		e1.setEname("SMITH");
		e1.setEsal(800);
		
		Employee e2 = new Employee();
		e2.setEid(102);
		e2.setEname("MILLER");
		e2.setEsal(1250);
		
		Employee e3 = new Employee();
		e3.setEid(103);
		e3.setEname("KING");
		e3.setEsal(5000);
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		
		ModelAndView mav = new ModelAndView("display");
		mav.addObject("emps",employees);
		return mav;
	}
}
