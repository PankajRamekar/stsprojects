package com.te.learnlms.response;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class GeneralResponse {

	private String token;
	private HttpStatus httpStatus;
	private String error;
	private String message;
	private Object data;
}
