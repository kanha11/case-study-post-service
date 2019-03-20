package com.casestudy.post_service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
//	@RequestMapping(value = "/employees", method = RequestMethod.GET, produces = "application/json")
//	public List<Employee> getEmployees() {
//		List<Employee> employees = new LinkedList<>();
//		employees.add(new Employee(1234, "employee@yodlee.com"));
//		employees.add(new Employee(2345, "abcd@yodlee.com"));
//		return employees;
//	}
//	
//	@RequestMapping(value = "/employee/{eid}", method = RequestMethod.GET, produces = "application/json")
//	public Employee getEmployee(@PathVariable Integer eid) {
//		return new Employee(eid, "employee@yodlee.com");
//	}

	@RequestMapping(value = "/employee", method = RequestMethod.POST, produces = "application/json")
	public void addEmployee(Employee emp) {
		// add emp to mongo
	}
}