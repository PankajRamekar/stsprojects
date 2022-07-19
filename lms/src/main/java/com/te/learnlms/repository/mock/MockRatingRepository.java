package com.te.learnlms.repository.mock;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.learnlms.entity.MockRating;

@Repository
public interface MockRatingRepository extends JpaRepository<MockRating, Integer>{
	

}
