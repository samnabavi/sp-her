package com.hcl.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.dao.EmpRepository;
import com.hcl.exception.FailedDatabaseActionException;
import com.hcl.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmpRepository repo;
	
	public boolean saveEmployee(Employee emp) throws FailedDatabaseActionException {
		try {
			repo.save(emp);
			return true;
		} catch(Exception e) {
			throw new FailedDatabaseActionException("Couldn't insert to database... check your connection", e);
		}
	}
	
	public List<Employee> findAllEmployees() {
		return (List<Employee>) repo.findAll();
	}
	
	public Optional<Employee> findEmployeeById(long id) {
		return repo.findById(id);
	}
	
	public boolean deleteEmployee(Employee emp) throws FailedDatabaseActionException {
		try {
			repo.delete(emp);
			return true;
		} catch( Exception e) {
			throw new FailedDatabaseActionException("Couldn't delete from database... check your connection", e);
		}
	}
}
