package com.te.learnlms.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Mentor {

	@Id
	private String employeeId;
	private String mentorName;
	private String emailId;
	@OneToMany(cascade = CascadeType.ALL)
	private List<TechnicalSkills> technicalSkills;
}
