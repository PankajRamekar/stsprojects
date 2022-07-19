package com.te.learnlms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum AccountType {
	
	SAVING("SAVING"),CURRENT("CURRENT");
	
	private final String accType;

}
