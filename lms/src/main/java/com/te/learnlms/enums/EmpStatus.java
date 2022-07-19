package com.te.learnlms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum EmpStatus {
	
	ACTIVE("ACTIVE"),TERMINATED("TERMINATED"),ABSCONDED("ABSCONDED");
	
private final String status;

}
