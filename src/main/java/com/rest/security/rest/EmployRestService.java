package com.rest.security.rest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.security.model.Employee;

@RestController
public class EmployRestService {
	private static final Map <Integer, Employee> emplist = new HashMap<>();

	@RequestMapping(method=RequestMethod.GET, value="/employee")
	public Collection<Employee> getAllEmployee(){
		if(CollectionUtils.isEmpty(emplist)){
			emplist.put(1, new Employee(1, "Saman", 12, "Matara"));
			emplist.put(2, new Employee(2, "Kamal", 12, "Colombo"));
			emplist.put(3, new Employee(3, "Amal", 12, "Jafna"));
			emplist.put(4, new Employee(4, "Arun", 12, "Negombo"));
		}
		return emplist.values();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/employee/{empId}")
	public @ResponseBody Employee getEmployeeById(@PathVariable Integer empId){
		return emplist.get(empId);
	}
}
