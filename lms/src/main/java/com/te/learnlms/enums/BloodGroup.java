package com.te.learnlms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum BloodGroup {
	
	A_POSITIVE("A_POSITIVE"),B_POSITIVE("B_POSITIVE"),O_POSITIVE("O_POSITIVE"),AB_POSITIVE("AB_POSITIVE"),
	A_NEGATIVE("A_NEGATIVE"),B_NEGATIVE("B_NEGATIVE"),O_NEGATIVE("O_NEGATIVE"),AB_NEGATIVE("AB_NEGATIVE");
	
	
private final String bloodGroups;
}
