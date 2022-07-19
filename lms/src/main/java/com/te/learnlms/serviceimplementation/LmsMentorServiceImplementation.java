package com.te.learnlms.serviceimplementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.te.learnlms.entity.Attendance;
import com.te.learnlms.entity.Employee;
import com.te.learnlms.entity.Mentor;
import com.te.learnlms.entity.dto.AllAttendanceDto;
import com.te.learnlms.entity.dto.AttendanceDto;
import com.te.learnlms.entity.dto.MentorDto;
import com.te.learnlms.repository.employee.AttendanceRepository;
import com.te.learnlms.repository.employee.EmployeeRepository;
import com.te.learnlms.repository.mentor.MentorRepository;
import com.te.learnlms.service.LmsMentorService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service

public class LmsMentorServiceImplementation implements LmsMentorService {

	private final MentorRepository mentorRepository;
	private final EmployeeRepository employeeRepository;
	private final AttendanceRepository attendanceRepository;

	@Override
	public MentorDto register(MentorDto mentorDto) {
		Mentor mentor = new Mentor();
		BeanUtils.copyProperties(mentorDto, mentor);
		mentorRepository.save(mentor);
		return mentorDto;
	}

	@Override
	public MentorDto getMentor(String mentorId) {
		MentorDto mentorDto = new MentorDto();
		Optional<Mentor> optional = mentorRepository.findById(mentorId);
		if (optional.isPresent()) {
			Mentor mentor = optional.get();
			BeanUtils.copyProperties(optional, mentorDto);
			return mentorDto;
		}
		return null;
	}

	@Override
	public String employeeAttendance(String empId, AttendanceDto attendanceDto) {

		Attendance attendance = new Attendance();
		Employee employee = employeeRepository.getById(empId);
		attendance.setEmployee(employee);
		BeanUtils.copyProperties(attendanceDto, attendance);
		List<Employee> findAll = employeeRepository.findAll();
		findAll.stream().forEach(p -> {
			if (p.getEmployeeId().equals(empId)) {
				Attendance save = attendanceRepository.save(attendance);
			}
		});

		return "Attendance Saved";
	}
	
	//method for save all attendance at shot

	@Override
	public String allAttendances(AllAttendanceDto allAttendanceDto) {
		// TODO Auto-generated method stub
		List<AttendanceDto> attendanceDtos = allAttendanceDto.getAttendanceDtos();
		attendanceDtos.stream().forEach(m ->{
			String employeeId = m.getEmployeeId();
			Attendance attendance= new Attendance();
			BeanUtils.copyProperties(m, attendance);
			Employee employee = employeeRepository.getById(employeeId);
			attendance.setEmployee(employee);
			attendanceRepository.save(attendance);
			
		});
		
		return null;
	}

}
