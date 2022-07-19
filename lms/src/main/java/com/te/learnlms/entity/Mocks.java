package com.te.learnlms.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.te.learnlms.enums.Technology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Mocks {
	
	@Id
	private Integer mockNo;
	private Technology technology;
	private String panel;
	private LocalDate date;
}
