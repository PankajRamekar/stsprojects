package com.te.learnlms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Technology {

	JAVA("JAVA"), PYTHON("PYTHON"),javascript("javascript");
	
	private final String technology; 
}
