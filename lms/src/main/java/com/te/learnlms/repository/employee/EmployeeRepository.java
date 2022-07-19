package com.te.learnlms.repository.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.learnlms.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

	//Employee findbyemployeeId(String empId);
	

}
