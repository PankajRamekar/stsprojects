package com.te.learnlms.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import com.te.learnlms.enums.MaritialStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SecondaryInfo {

	@Id
	private String panNo;
	private Long aadharNo;
	private String fatherName;
	private String motherName;
	private String spouseName;
	private String passportNo;
	@Enumerated(EnumType.STRING)
	private MaritialStatus maritialStatus;

}
