package com.te.learnlms.entity.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class AllAttendanceDto {
	
	private List<AttendanceDto> attendanceDtos;

}
