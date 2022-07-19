package com.te.learnlms.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.te.learnlms.enums.AddressType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Attendance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer attendanceId;
	private LocalDate attendanceDate= LocalDate.now();
	private Boolean attendanceMorning;
	private Boolean attendanceNoon;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Employee employee;
	

}
