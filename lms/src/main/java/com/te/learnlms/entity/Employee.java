package com.te.learnlms.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.te.learnlms.enums.BloodGroup;
import com.te.learnlms.enums.EmpStatus;
import com.te.learnlms.enums.Gender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {

	@Id
	private String employeeId;
	private String employeeName;
	private String emailId;
	private LocalDate empDateOfJoining;
	private LocalDate dateOfBirth;
	@Enumerated(EnumType.STRING)
	private BloodGroup bloodGroup;
	private String empDesignation;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	private String nationality;
	@Enumerated(EnumType.STRING)
	private EmpStatus empStatus;
	
	@OneToOne(cascade = CascadeType.ALL)
	private SecondaryInfo secondaryInfo;
	@OneToMany(cascade = CascadeType.ALL)
	private List<EducationDetails> educationDetails;
	@OneToMany(cascade = CascadeType.ALL)
	private List<AddressDetails> addressDetails;
	@OneToOne(cascade = CascadeType.ALL)
	private BankDetails bankDetails;
	@OneToMany(cascade = CascadeType.ALL)
	private List<TechnicalSkills> technicalSkills;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Experience> experiences;
	@OneToMany(cascade = CascadeType.ALL)
	private List<ContactDetails> contactDetails;
	@OneToMany(mappedBy = "employee")
	private List<Attendance> attendances;

	/*
	 * @OneToOne private BatchS batchS;
	 */

}
