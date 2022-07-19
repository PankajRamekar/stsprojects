package com.te.learnlms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter

public enum AddressType {
	
	PERMANANT("PERMANANT"),TEMPORARY("TEMPORARY");
	
	private final String addType;
}
