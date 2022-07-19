package com.te.learnlms.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.te.learnlms.enums.AddressType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class AddressDetails {
	
	@Id
	@GeneratedValue
	private Integer AddressId;
	@Enumerated(EnumType.STRING)
	private AddressType addressType;
	private int doorNo;
	private String street;
	private String locality;
	private String city;
	private String addState;
	private String landMark;
	private long pincode;
	
	

}
