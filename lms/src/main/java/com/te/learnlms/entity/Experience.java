package com.te.learnlms.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Experience {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer experienceId;
	private String companyName;
	private double yearOfExperience;
	private LocalDate dateOfJoining;
	private LocalDate dateOfRelieving;
	private String designation;
	private String location;
}
