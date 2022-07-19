package com.tyss.homedelivery.service.implementation;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;

import com.tyss.homedelivery.pojo.User;
import com.tyss.homedelivery.pojo.UserComments;
import com.tyss.homedelivery.repository.UserCommentRepository;
import com.tyss.homedelivery.service.AppService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class AppServiceImplementation implements AppService {

	private final UserCommentRepository commentRepository;

	// to store comment in DB
	@Override
	public String saveComment(UserComments userComments, Long userId) {
		userComments.setUserId(userId);
		UserComments comments = commentRepository.save(userComments);
		return comments.getComment();
	}

	// to get recent comment
	@Override
	// method to get comments after 30 sec
	@Scheduled(fixedRate = 30000)
	public String getlastComment() {

		List<UserComments> all = commentRepository.findAll();

		// ToDo check bad words in comment

		all.stream().forEach(m -> {
			String comment = m.getComment();
			if (comment.contains("bad")) {
				// comment.replace("bad", "good");
				updateComment(m.getUserId());
				System.out.println("this is userid " + m.getUserId() + "comment updated ");
			}
			System.out.println(comment);
		});

		System.out.println("get the comments  " + LocalDateTime.now());
		System.out.println(all.toString());
		return "get comments";
	}

	// to update Bad comment

	@Override
	public String updateComment(Long userId) {
			//to replace bad comment with this string
		String newComment = "comment is changed";

		UserComments byuserId = commentRepository.getByuserId(userId);
		byuserId.setComment(newComment);
		UserComments updatedComment = commentRepository.save(byuserId);
		return updatedComment.getComment();

	}

}
