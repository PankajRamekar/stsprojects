package com.te.learnlms.entity;

import java.time.Year;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.te.learnlms.enums.EducationType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class EducationDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer eduId;
	@Enumerated(EnumType.STRING)
	private EducationType educationType;
	private Year yearOfPassing;
	private float percentage;
	private String universityName;
	private String instituteName;
	private String specialization;
	private String eduState;

}
