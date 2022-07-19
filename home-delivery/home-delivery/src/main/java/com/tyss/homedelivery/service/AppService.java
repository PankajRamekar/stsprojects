package com.tyss.homedelivery.service;

import org.springframework.scheduling.annotation.Scheduled;

import com.tyss.homedelivery.pojo.UserComments;

public interface AppService {

	String saveComment(UserComments userComments, Long userId);
	
	
	
	String getlastComment();
	

	String updateComment(Long userId);
	
	
	

	
	
}
