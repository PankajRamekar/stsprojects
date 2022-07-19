package com.te.learnlms.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.te.learnlms.enums.MockType;
import com.te.learnlms.enums.Technology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class MockRating {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer mockRatingId;
	private MockType mockType;
	private String mockTakenBy;
	@Enumerated(EnumType.STRING)
	private Technology technology;
	private int practicalKnowledge;
	private int theoreticalKnowledge;
	private int overallFeedback;
	private String detailedFeedback;

}
