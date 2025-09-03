package com.example.demo;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	EmployeeRepo employeeRepo;

	public EmployeeService(EmployeeRepo employeeRepo) {
		super();
		this.employeeRepo = employeeRepo;
	}

	public Employee save(Employee employee) {
		return employeeRepo.save(employee);
	}
	
	public List<Employee> getAllEmployee() {
		return employeeRepo.findAll();
	}
	
	public Employee getEmployee(int id) {
		return employeeRepo.findById(id).orElse(null);
	}
	
	public void deleteEmployee(int id) {
		employeeRepo.deleteById(id);
	}
}
