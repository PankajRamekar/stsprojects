package com.te.learnlms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MaritialStatus {
	
	SINGLE("SINGLE"),MARRIED("MARRIED"),DIVORCED("DIVORCED");
	
	private final String maritialStatus;

}
