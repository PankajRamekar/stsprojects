package com.te.learnlms.service;

import com.te.learnlms.entity.dto.AllAttendanceDto;
import com.te.learnlms.entity.dto.AttendanceDto;
import com.te.learnlms.entity.dto.MentorDto;

public interface LmsMentorService {

	MentorDto register(MentorDto mentorDto);

	MentorDto getMentor(String mentorId);

	String employeeAttendance(String empId, AttendanceDto attendanceDto);

	String allAttendances(AllAttendanceDto allAttendanceDto);

}
