package com.te.learnlms.service;

import com.te.learnlms.entity.dto.GetEmployeeDto;
import com.te.learnlms.entity.dto.RegisterDto;
import com.te.learnlms.entity.dto.ShowDetailsDto;
import com.te.learnlms.entity.dto.UpdateDto;

public interface LmsService {

	ShowDetailsDto registerEmployee(RegisterDto registerDto);


	GetEmployeeDto getDeatils(String empId);


	ShowDetailsDto updateEmployee(String empId, UpdateDto updateDto);


	Boolean deleteEmployee(String empId);


}
