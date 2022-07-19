package com.te.learnlms.entity.dto;

import java.util.List;

import com.te.learnlms.entity.ContactDetails;
import com.te.learnlms.entity.EducationDetails;
import com.te.learnlms.entity.Experience;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class ShowDetailsDto {

	private String employeeId;
	private String employeeName;
	private List<EducationDetails>educationDetails;
	private List<Experience> experiences;
	private List<ContactDetails> contactDetails;

}
