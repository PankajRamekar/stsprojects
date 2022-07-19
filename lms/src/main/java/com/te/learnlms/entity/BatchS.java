package com.te.learnlms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.te.learnlms.enums.AccountType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class BatchS {
	
	@Id
	private Long batchId;
	private String batchName;
	
}
