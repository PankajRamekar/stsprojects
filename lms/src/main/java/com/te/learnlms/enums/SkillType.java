package com.te.learnlms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum SkillType {
	JAVA("JAVA"), PYTHON("PYTHON"),javascript("javascript");
	
	public final String skills;
	
}
