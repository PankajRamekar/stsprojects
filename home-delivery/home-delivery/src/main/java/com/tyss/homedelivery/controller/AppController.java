package com.tyss.homedelivery.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.homedelivery.pojo.UserComments;
import com.tyss.homedelivery.response.GeneralResponse;
import com.tyss.homedelivery.service.AppService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class AppController {
	
	private final AppService appService;
	
	@PostMapping("/comment/{userId}")
	public ResponseEntity<GeneralResponse> saveComment(@RequestBody UserComments userComments,@PathVariable long userId ) {
		String comment=appService.saveComment(userComments, userId);
		return ResponseEntity.ok().body(new GeneralResponse("token", HttpStatus.OK, null, "message", comment));
		
	}
	
	@GetMapping("/comment")
	public ResponseEntity<GeneralResponse>getlastComment() {
		String comment=appService.getlastComment();
		return ResponseEntity.ok().body(new GeneralResponse("token", HttpStatus.OK, null, "message", comment));
		
	}
	
	@PutMapping("/comment/{userId}")
	public ResponseEntity<GeneralResponse> updateComment(@PathVariable long userId ) {
		String comment=appService.updateComment( userId);
		return ResponseEntity.ok().body(new GeneralResponse("token", HttpStatus.OK, null, "message", comment));
		
	}

}
