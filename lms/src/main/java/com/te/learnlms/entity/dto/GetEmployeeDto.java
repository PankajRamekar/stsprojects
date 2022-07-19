package com.te.learnlms.entity.dto;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Enumerated;

import com.te.learnlms.entity.AddressDetails;
import com.te.learnlms.entity.BankDetails;
import com.te.learnlms.entity.ContactDetails;
import com.te.learnlms.entity.EducationDetails;
import com.te.learnlms.entity.Experience;
import com.te.learnlms.entity.TechnicalSkills;
import com.te.learnlms.enums.BloodGroup;
import com.te.learnlms.enums.EmpStatus;
import com.te.learnlms.enums.Gender;
import com.te.learnlms.enums.MaritialStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class GetEmployeeDto {
	// primaryInfo
	// private PrimaryInfo primaryInfo;

	private String employeeId;
	private String employeeName;
	private String emailId;
	private LocalDate empDateOfJoining;
	private LocalDate dateOfBirth;

	@Enumerated
	private BloodGroup bloodGroup;
	private String empDesignation;

	@Enumerated
	private Gender gender;
	private String nationality;

	@Enumerated
	private EmpStatus empStatus;

	// secondaryInfo
	// private SecondaryInfo secondaryInfo;

	private String panNo;
	private Long aadharNo;
	private String fatherName;
	private String motherName;
	private String spouseName;
	private String passportNo;

	@Enumerated
	private MaritialStatus maritialStatus;

	// educationDetails

	private List<EducationDetails> educationDetails;
	/*
	 * private EducationType educationType; private Year yearOfPassing; private
	 * float percentage; private String universityName; private String
	 * instituteName; private String specialization; private String eduState;
	 */

	// addressDetails
	private List<AddressDetails> addressDetails;
	/*
	 * @Enumerated private AddressType addressType; private int doorNo; private
	 * String street; private String locality; private String city; private String
	 * addState; private String landMark; private long pincode;
	 */

	// bankDetails
	private BankDetails bankDetails;
	/*
	 * private long accountNo; private String bankName;
	 * 
	 * @Enumerated private AccountType accountType; private String branch; private
	 * String state;
	 */

	// TechnicalSkills
	private List<TechnicalSkills> technicalSkills;
	/*
	 * @Enumerated private SkillType skillType;
	 * 
	 * @Enumerated private SkillRating skillRating; private double
	 * skillYearOfExperience;
	 */

	// experience
	private List<Experience> experiences;
	/*
	 * private String companyName; private double yearOfExperience; private
	 * LocalDate dateOfJoining; private LocalDate dateOfRelieving; private String
	 * designation; private String location;
	 */

	// contacts
	private List<ContactDetails> contactDetails;
	/*
	 * private ContactType contactType; private long contactNo;
	 */

}
