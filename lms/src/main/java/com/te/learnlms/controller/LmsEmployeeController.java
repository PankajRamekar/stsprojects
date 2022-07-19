package com.te.learnlms.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.learnlms.entity.dto.GetEmployeeDto;
import com.te.learnlms.entity.dto.RegisterDto;
import com.te.learnlms.entity.dto.ShowDetailsDto;
import com.te.learnlms.entity.dto.UpdateDto;
import com.te.learnlms.response.GeneralResponse;
import com.te.learnlms.service.LmsService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/lms1")
public class LmsEmployeeController {
	
	private final LmsService lmsService;

	@GetMapping("/home")
	public String welcome() {
		return "WelCome to LMS";
	}

	@PostMapping("/register")
	public ResponseEntity<GeneralResponse> register(@RequestBody RegisterDto registerDto) {
		ShowDetailsDto showDetailsDto =lmsService.registerEmployee(registerDto);
		return ResponseEntity.ok().body(new GeneralResponse(null, null, null, null, showDetailsDto));
	}
	
	@GetMapping("/employee/{empId}")
	public ResponseEntity<GeneralResponse> getDetails(@PathVariable String empId) {
		GetEmployeeDto getEmployeeDto=lmsService.getDeatils(empId);
		return ResponseEntity.ok().body(new GeneralResponse(null, null, null, null, getEmployeeDto));
	}
	
	@PutMapping("/update/{empId}")
	public ResponseEntity<GeneralResponse> updateEmployee(@PathVariable String empId, @RequestBody UpdateDto updateDto) {
		ShowDetailsDto showDetailsDto =lmsService.updateEmployee(empId,updateDto);
		return ResponseEntity.ok().body(new GeneralResponse(null, null, null, "Employee Updated", showDetailsDto));
	}
	
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<GeneralResponse> deleteEmployee(@PathVariable String empId) {
		Boolean employeeDeleted =lmsService.deleteEmployee(empId);
		return ResponseEntity.ok().body(new GeneralResponse(null, null, null, "Employee deleted", employeeDeleted));
	}
}
