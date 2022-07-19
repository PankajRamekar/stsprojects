package com.te.learnlms.repository.employee;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.learnlms.entity.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Integer>{

}
