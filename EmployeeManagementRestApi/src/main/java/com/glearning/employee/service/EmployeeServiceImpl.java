package com.glearning.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.glearning.employee.dao.EmployeeRepository;
import com.glearning.employee.model.Employee;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {


	private final EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployees() {
	return this.employeeRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return this.employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(Long id) {
		return this.employeeRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("invalid employee id passed"));

	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return this.employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployeeById(Long id) {
		this.employeeRepository.deleteById(id);
		
	}

}
