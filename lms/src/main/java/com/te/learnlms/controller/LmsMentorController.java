package com.te.learnlms.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.learnlms.entity.dto.AllAttendanceDto;
import com.te.learnlms.entity.dto.AttendanceDto;
import com.te.learnlms.entity.dto.MentorDto;
import com.te.learnlms.response.GeneralResponse;
import com.te.learnlms.service.LmsMentorService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/lms2")
public class LmsMentorController {

	private final LmsMentorService lmsMentorService;

	@PostMapping("/register")
	public ResponseEntity<GeneralResponse> register(@RequestBody MentorDto mentorDto) {
		mentorDto = lmsMentorService.register(mentorDto);
		return ResponseEntity.ok().body(new GeneralResponse(null, null, null, null, mentorDto));
	}

	@PostMapping("/attendance/{empId}")
	public ResponseEntity<GeneralResponse> empAttendance(@RequestBody AttendanceDto attendanceDto,
			@PathVariable String empId) {
		String employeeAttendance = lmsMentorService.employeeAttendance(empId, attendanceDto);
		return ResponseEntity.ok().body(new GeneralResponse(null, null, null, employeeAttendance, attendanceDto));

	}
	
	@PostMapping("/attendances")
	public ResponseEntity<GeneralResponse> allAttendances(@RequestBody AllAttendanceDto allAttendanceDto) {
		String employeeAttendances = lmsMentorService.allAttendances(allAttendanceDto);
		return ResponseEntity.ok().body(new GeneralResponse(null, null, null, employeeAttendances,allAttendanceDto ));

	}

}
