package com.te.learnlms.entity.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class AttendanceDto {
	
	
	//private LocalDate attendanceDate= LocalDate.now();
	private String employeeId;
	private Boolean attendanceMorning;
	private Boolean attendanceNoon;
	
	
	

}
