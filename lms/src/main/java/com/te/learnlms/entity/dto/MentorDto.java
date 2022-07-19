package com.te.learnlms.entity.dto;

import java.util.List;

import com.te.learnlms.entity.TechnicalSkills;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class MentorDto {

	
	private String employeeId;
	private String mentorName;
	private String emailId;
	private List<TechnicalSkills> technicalSkills;
}
