package com.tyss.homedelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tyss.homedelivery.pojo.UserComments;

@Repository
public interface UserCommentRepository extends JpaRepository<UserComments, Integer>{

	UserComments getByuserId(long userId);

}
