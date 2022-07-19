package com.te.learnlms.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.te.learnlms.enums.SkillRating;
import com.te.learnlms.enums.SkillType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TechnicalSkills {

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer skillId;
	@Enumerated(EnumType.STRING)
	private SkillType skillType;
	@Enumerated(EnumType.STRING)
	private SkillRating skillRating;
	private double skillYearOfExperience;

}
