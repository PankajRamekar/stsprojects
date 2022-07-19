package com.te.learnlms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum EducationType {
	
	REGULAR("REGULAR"),PARTTIME("PARTTIME");
	
	private final String eduType;

}
