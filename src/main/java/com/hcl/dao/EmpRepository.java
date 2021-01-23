package com.hcl.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.model.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Long>{

}
