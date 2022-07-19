package com.te.learnlms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter 
public enum SkillRating {

	AVARAGE("AVARAGE"),GOOD("GOOD"), EXCELENT("EXCELENT");
	
	private final String skillRating;
}
