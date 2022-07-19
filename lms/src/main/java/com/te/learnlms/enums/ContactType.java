package com.te.learnlms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ContactType {

	PRIMARY("PRIMARY"),ALTERNATIVE("ALTERNATIVE");
	
	private final String type;
}
